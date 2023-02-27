//
//  PatternScreen.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/24/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import UIKit

struct PatternScreen: View {
    @State private var pattern: [Int] = []
    @State private var proceed = false
    var body: some View {
        VStack {
            NavigationLink(
                destination: SocialMediaLoginScreen(),
                isActive: $proceed
            ) {
                EmptyView()
            }
            .hidden()
            LoginSubHeader(text: "set your own")
                .padding(.top, 8)

            ColorizedFirstCharText(
                firstWord: "Entrance",
                secondWord: "Pattern",
                firstCharColor: Color.secondaryColor,
                secondCharColor: Color.tertiaryColor
            )
            .titleLargeStyle()

            LockScreenAdapter(
                frame: CGRect(x: 0, y: 0, width: 500, height: 500),
                action: { uniqeId, cellsInOrder in
                    print("id: \(uniqeId), cells: \(cellsInOrder)")
                    pattern = cellsInOrder
                }
            )
            .frame(width: 425)
            .frame(maxHeight: 390)
            .padding(.top, -50)

            Button {
                proceed = true
            } label: {
                Text("Submit Pattern")
                    .primaryButtonStyle()
            }
            .disabled(pattern.count < 4)
            .padding(.horizontal, 30)

            OrDivider()
                .padding(.horizontal, 30)

            Button(
                action: {},
                label: {
                    ZStack {
                        HStack {
                            Image("finger_scan")
                            Text("Use my face/finger recognition")
                        }
                        
                    }
                    .frame(maxWidth: .infinity)
                    .frame(height: 48)
                    .bodySmallStyle()
                    .foregroundColor(Color.onBackgroundColor)
                    .padding(.horizontal, 14)
                    .background(
                        RoundedCorner(radius: 14)
                            .stroke(Color.onBackgroundColor)
                    )
                    .padding(.horizontal, 56)
                }
            )

            HStack(
                alignment: .lastTextBaseline
            ) {
                LoginBodyText(text: "Prefer less secure?")

                UnderlineText(
                    str: "Ignore setting pattern",
                    textColor: Color.primaryColor
                )
                .bodySmallStyle()
            }
            .padding(.top, 30)

            Spacer()
        }
        .navigationBarBackButtonHidden(true)
    }
}

struct PatternScreen_Previews: PreviewProvider {
    static var previews: some View {
        PatternScreen()
    }
}
