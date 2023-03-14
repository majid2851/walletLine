//
//  MobileVerifyScreen.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/22/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct MobileVerifyScreen: View {
    @State private var phoneNumber: String = "+98 00 000 000 00"
    @State private var isChangeNumberVisible: Bool = false
    @State private var isResendVisible: Bool = false
    @State private var otpText: String = ""
    @State private var proceed = false
    var body: some View {
        ScrollView {
            VStack(spacing: 0) {
                NavigationLink(
                    destination: PatternScreen(),
                    isActive: $proceed
                ) {
                    EmptyView()
                }
                .hidden()
                
                ColorizedText(
                    firstWord: NSLocalizedString("Verify", comment: ""),
                    secondWord: NSLocalizedString("Number", comment: ""),
                    thirdWord: NSLocalizedString("!", comment: ""),
                    firstWordColor: Color.secondaryColor,
                    secondWordColor: Color.onBackgroundColor,
                    thirdWordColor: Color.primaryColor
                )
                .titleLargeStyle()
                .padding(.top, Dimen.mobileVerifyTopMargin)
                
                AuthBodyText(
                    text: NSLocalizedString("Enter the 4-digit code we have sent to", comment: "")
                )
                .padding(.horizontal, Padding.extraMedium)
                .padding(.top, Padding.small)
                
                Button(action: {
                    // Temporary
                    withAnimation(Animation.easeInOut(duration: 0.2)) {
                        isChangeNumberVisible.toggle()
                        isResendVisible.toggle()
                    }
                }, label: {
                    UnderlineText(
                        str: "\(phoneNumber).",
                        textColor: Color.primaryColor
                    )
                    .multilineTextAlignment(.center)
                    .boldBodyMediumStyle()
                    .padding(.top, Padding.small)
                })
                
                
                
                HStack(
                    alignment: .lastTextBaseline
                ) {
                    AuthBodyText(
                        text: NSLocalizedString("Wrong number?", comment: "")
                    )
                    
                    Button(action: {}, label: {
                        UnderlineText(
                            str: NSLocalizedString("Change It", comment: ""),
                            textColor: Color.primaryColor
                        )
                        .boldBodyMediumStyle()
                    })
                }
                .opacity(isChangeNumberVisible ? 1 : 0)
                .padding(.top, Padding.extraMedium)
                
                OtpTextField(otpText: $otpText)
                    .padding(.top, Padding.large)
                
                VStack {
                    AuthBodyText(
                        text: NSLocalizedString("Didn't received the code?", comment: "")
                    )
                    
                    Button(action: {}, label: {
                        UnderlineText(
                            str: NSLocalizedString("Resend Code", comment: ""),
                            textColor: Color.primaryColor
                        )
                        .boldBodyMediumStyle()
                        .padding(.horizontal, Padding.smallLarge)
                    })
                }
                .padding(.top, Padding.large)
                .opacity(isResendVisible ? 1 : 0)
                
                Button {
                    proceed = true
                } label: {
                    Text(
                        NSLocalizedString("Proceed", comment: "")
                    )
                        .primaryButtonStyle()
                }
                .disabled(otpText.count < 4)
                .padding(.horizontal, Padding.smallLarge)
                .padding(.top, Padding.large)
                
                EmbeddedUnderlineText(
                    normalText: NSLocalizedString("by clicking start you agree with our", comment: ""),
                    underlineText: NSLocalizedString("Terms and Conditions", comment: ""),
                    textColor: Color.onBackgroundColor.opacity(0.8),
                    underlineTextColor: Color.primaryColor,
                    normalTextFont: DMSans.medium,
                    underlineTextFont: DMSans.bold,
                    textSize: 15
                )
                .multilineTextAlignment(.center)
                .padding(Padding.smallMedium)
                .padding(.horizontal, Padding.smallLarge)
                .lineSpacing(Padding.small)
            }
        }
        .navigationBarBackButtonHidden(true)
        .background(Color.backgroundColor)
    }
}

struct MobileVerifyScreen_Previews: PreviewProvider {
    static var previews: some View {
        MobileVerifyScreen()
    }
}
