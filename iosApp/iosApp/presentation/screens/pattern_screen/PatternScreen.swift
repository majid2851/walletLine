//
//  PatternScreen.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/24/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct PatternScreen: View {
    @State private var pattern: [Int] = []
    @State private var proceed = false
    var body: some View {
        ScrollView {
            VStack(spacing: Padding.defaultPadd) {
                NavigationLink(
                    destination: RegistrationFinishedScreen(),
                    isActive: $proceed
                ) {
                    EmptyView()
                }
                .hidden()
                LoginSubHeader(
                    text: NSLocalizedString("set your own", comment: "")
                )
                .padding(.top, Padding.small)
                
                ColorizedFirstCharText(
                    firstWord: NSLocalizedString("Entrance", comment: ""),
                    secondWord: NSLocalizedString("Pattern", comment: ""),
                    firstCharColor: Color.secondaryColor,
                    secondCharColor: Color.tertiaryColor
                )
                .titleLargeStyle()
                
                LockScreenPattern(
                    frame: CGRect(x: 0, y: 0, width: 500, height: 500),
                    action: { uniqeId, cellsInOrder in
                        print("id: \(uniqeId), cells: \(cellsInOrder)")
                        pattern = cellsInOrder
                    }
                )
                .frame(width: Dimen.lockPatternWidth, height: Dimen.lockPatternHeight)
                
                Button {
                    proceed = true
                } label: {
                    Text(
                        NSLocalizedString("Submit Pattern", comment: "")
                    )
                    .primaryButtonStyle()
                }
                .disabled(pattern.count < 4)
                .padding(.horizontal, Padding.smallLarge)
                
                OrDivider()
                    .padding(.horizontal, Padding.smallLarge)
                    .padding(.top, Padding.medium)
                
                Button(
                    action: {},
                    label: {
                        HStack {
                            Image("finger_scan")
                            Spacer()
                            Text(
                                NSLocalizedString("Use my face/finger recognition", comment: "")
                            )
                            Spacer()
                        }
                        .frame(maxWidth: .infinity)
                        .frame(height: Padding.large)
                        .bodySmallStyle()
                        .foregroundColor(Color.onBackgroundColor)
                        .padding(.horizontal, Padding.smallMedium)
                        .background(
                            RoundedCorner(radius: Padding.smallMedium)
                                .stroke(Color.onBackgroundColor)
                        )
                        .padding(.horizontal, Padding.large)
                        .padding(.top, Padding.medium)
                    }
                )
                
                HStack(
                    alignment: .lastTextBaseline
                ) {
                    AuthBodyText(text: NSLocalizedString("Prefer less secure?", comment: ""))
                    
                    UnderlineText(
                        str: NSLocalizedString("Ignore setting pattern", comment: ""),
                        textColor: Color.primaryColor
                    )
                    .bodySmallStyle()
                }
                .padding(.top, Padding.extraLarge)
            }
        }
        .background(Color.backgroundColor)
        .navigationBarBackButtonHidden(true)
    }
}

struct PatternScreen_Previews: PreviewProvider {
    static var previews: some View {
        PatternScreen()
    }
}
