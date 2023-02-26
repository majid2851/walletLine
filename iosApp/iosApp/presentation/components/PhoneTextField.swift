//
//  PhoneTextField.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/20/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Combine
import SwiftUI

struct PhoneTextField: View {
    @State var text: String
    var countries = ["NL +31", "IR +98"]
    @State private var index = 0
    @State private var selected = "NL +31"
    var body: some View {
        HStack {
            Menu {
                ForEach(
                    Array(countries.enumerated()),
                    id: \.offset
                ) { index, country in

                    Button(
                        action: {
                            self.index = index
                            self.selected = country
                        }, label: {
                            HStack {
                                Text(country)
                                    .bodyMediumStyle()
                                if selected == countries[index] {
                                    Image(systemName: "checkmark")
                                }
                            }
                        }
                    )
                }
            } label: {
                Text(countries[index])
                    .foregroundColor(Color.onBackgroundColor)
                Image("arrow_down")
            }
            .frame(width: 80)
            Divider().padding(.vertical, 8)
            TextField("Phone Number", text: $text)
                .keyboardType(.numberPad)
                .onReceive(
                    Just(text)
                ) { newValue in
                    let filtered = newValue.filter {
                        "0123456789".contains($0)
                    }
                    if filtered != newValue {
                        self.text = filtered
                    }
                }
        }
        .frame(height: 56)
        .padding(.horizontal)
        .overlay(
            RoundedRectangle(cornerRadius: 16)
                .stroke(Color.outlineVariantColor, lineWidth: 2)
        )
    }
}

struct PhoneTextField_Previews: PreviewProvider {
    static var previews: some View {
        PhoneTextField(
            text: ""
        )
    }
}
