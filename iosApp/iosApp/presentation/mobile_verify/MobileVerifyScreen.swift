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
    var body: some View {
        ScrollView {
            VStack {
                Spacer(minLength: 109)
                
                ColorizedText(
                    firstWord: "Verify",
                    secondWord: "Number",
                    thirdWord: "!",
                    firstWordColor: Color.secondaryColor,
                    secondWordColor: Color.onBackgroundColor,
                    thirdWordColor: Color.primaryColor
                )
                .titleLargeStyle()
                
                Text("Enter the 4-digit code we have sent to")
                    .multilineTextAlignment(.center)
                    .foregroundColor(Color.onBackgroundColor.opacity(0.8))
                    .bodyMediumStyle()
                    .padding(.horizontal, 28)
                    .padding(.top, 8)
                
                UnderlineText(
                    str: "\(phoneNumber).",
                    textColor: Color.primaryColor
                )
                .multilineTextAlignment(.center)
                .boldBodyMediumStyle()
                .onTapGesture {
                    // Temporary
                    withAnimation(Animation.easeInOut(duration: 0.2)) {
                        isChangeNumberVisible.toggle()
                        isResendVisible.toggle()
                    }
                }
                .padding(.top, 0.5)
                
                HStack(
                    alignment: .lastTextBaseline
                ) {
                    Text("Wrong number?")
                        .multilineTextAlignment(.center)
                        .foregroundColor(Color.onBackgroundColor.opacity(0.8))
                        .bodyMediumStyle()
                    
                    UnderlineText(
                        str: "Change It",
                        textColor: Color.primaryColor
                    )
                    .boldBodyMediumStyle()
                }
                .opacity(isChangeNumberVisible ? 1 : 0)
                .padding(.top, 26)
                
                OtpTextField(otpText: $otpText)
                    .padding(.top, 56)
                
                VStack {
                    Text("Didn't received the code?")
                        .multilineTextAlignment(.center)
                        .foregroundColor(Color.onBackgroundColor.opacity(0.8))
                        .bodyMediumStyle()
                    
                    UnderlineText(
                        str: "Resend Code",
                        textColor: Color.primaryColor
                    )
                    .boldBodyMediumStyle()
                    .padding(.horizontal, 30)
                    .padding(.top, 0.5)
                }
                .padding(.top, 43)
                .opacity(isResendVisible ? 1 : 0)
                
                Button {} label: {
                    Text("Proceed")
                        .primaryButtonStyle()
                }
                .disabled(otpText.count < 4)
                .padding(.horizontal, 30)
                .padding(.top, 52)
                
                EmbeddedUnderlineText(
                    normalText: "by clicking start you agree with our",
                    underlineText: "Terms and Conditions",
                    textColor: Color.onBackgroundColor,
                    underlineTextColor: Color.primaryColor,
                    normalTextFont: DMSans.medium,
                    underlineTextFont: DMSans.bold,
                    textSize: 13
                )
                .multilineTextAlignment(.center)
                .padding(.horizontal, 30)
            }
        }
        .navigationBarBackButtonHidden(true)
    }
}

struct MobileVerifyScreen_Previews: PreviewProvider {
    static var previews: some View {
        MobileVerifyScreen()
    }
}
