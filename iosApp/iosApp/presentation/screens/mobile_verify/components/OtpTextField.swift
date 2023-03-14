//
//  OtpTextField.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/22/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import Combine

struct OtpTextField: View {
    @Binding var otpText: String
    @FocusState private var isKeyboardShowing: Bool
    var body: some View {
        HStack(spacing: 20) {
            ForEach(0 ..< 4, id: \.self) { index in
                OTPTextContainer(index: index)
            }
        }
        .background {
            TextField("", text: $otpText.limit(length: 4))
                .keyboardType(.numberPad)
                .textContentType(.oneTimeCode)
                .frame(width: 1, height: 1)
                .opacity(0.001)
                .blendMode(.screen)
                .focused($isKeyboardShowing)
                // Prevent type letters
                .onReceive(
                    Just(otpText)
                ) { newValue in
                    let filtered = newValue.filter {
                        "0123456789".contains($0)
                    }
                    if filtered != newValue {
                        self.otpText = filtered
                    }
                }
        }
        .contentShape(Rectangle())
        .onTapGesture {
            isKeyboardShowing.toggle()
        }
        .toolbar {
            ToolbarItem(placement: .keyboard) {
                Button("Done") {
                    isKeyboardShowing.toggle()
                }
                .frame(maxWidth: .infinity, alignment: .trailing)
            }
        }
    }

    @ViewBuilder
    func OTPTextContainer(index: Int) -> some View {
        let status = (isKeyboardShowing && otpText.count == index)
        ZStack {
            if otpText.count > index {
                let startIndex = otpText.startIndex
                let charIndex = otpText.index(startIndex, offsetBy: index)
                let charToString = String(otpText[charIndex])
                Text(charToString)
            } else {
                Text("0")
            }
        }
        .titleLargeStyle()
        .foregroundColor(status ? .primaryColor : .onBackgroundColor)
        .frame(width: 65, height: 45)
        .background {
            Rectangle()
                .fill(Color.primaryColor.opacity(0))
                .overlay(
                    Rectangle()
                        .frame(
                            width: nil,
                            height: 2,
                            alignment: .bottom
                        )
                        .foregroundColor(status ? .primaryColor : .onBackgroundColor),
                    alignment: .bottom
                )
                .animation(.easeInOut(duration: 0.2), value: status)
        }
    }
}

extension Binding where Value == String {
    func limit(length: Int) -> Self {
        if self.wrappedValue.count > length {
            DispatchQueue.main.async {
                self.wrappedValue = String(self.wrappedValue.prefix(length))
            }
        }
        return self
    }
}

struct OtpTextField_Previews: PreviewProvider {
    static var previews: some View {
        OtpTextField(otpText: .constant(""))
    }
}
