//
//  MobileLoginScreen.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/19/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct MobileLoginScreen: View {
    @State var phoneText: String = ""
    @State private var proceed = false
    @State var selectedCountry: String = "NL +31"
    var body: some View {
        ScrollView {
            VStack {
                NavigationLink(
                    destination: MobileVerifyScreen(),
                    isActive: $proceed
                ) {
                    EmptyView()
                }
                .hidden()
                Image("phone")
                    .resizable()
                    .frame(width: Dimen.phoneIconSize, height: Dimen.phoneIconSize)
                    .padding(.top, Padding.smallLarge)
                
                LoginSubHeader(
                    text: NSLocalizedString("enter your", comment: "")
                )
                .padding(.top, Padding.medium)
                
                ColorizedFirstCharText(
                    firstWord: NSLocalizedString("Mobile", comment: ""),
                    secondWord: NSLocalizedString("Number", comment: ""),
                    firstCharColor: Color.secondaryColor,
                    secondCharColor: Color.primaryContainerColor
                )
                .titleLargeStyle()
                .padding(.bottom, Padding.medium)
                
                AuthBodyText(
                    text: NSLocalizedString("We will provide you with 4 digit verification code", comment: "")
                )
                .padding(.horizontal, Padding.smallLarge)
                
                PhoneTextField(text: $phoneText, selected: $selectedCountry)
                    .padding(.vertical, Padding.medium)
                    .padding(.horizontal, Padding.medium)
                
                Button(
                    action: {
                        proceed = true
                    },
                    label: {
                        Text(
                            NSLocalizedString("Send Code", comment: "")
                        )
                        .primaryButtonStyle()
                    }
                )
                .padding(.horizontal, Padding.smallLarge)
                
                OrDivider()
                    .padding(.horizontal, Padding.smallLarge)
                    .padding(.top, Padding.large)
                
                AuthBodyText(
                    text: NSLocalizedString("Use your regular accounts to quick connect", comment: "")
                )
                .padding(.top, Padding.medium)
                .padding(.horizontal, Padding.smallLarge)
                
                HStack(spacing: Padding.large) {
                    SocialMediaIconButton(image: Image("google_icon"), action: {})
                    SocialMediaIconButton(image: Image("facebook_icon"), action: {})
                    SocialMediaIconButton(image: Image("apple_icon"), action: {})
                }
                .padding(.top, Padding.medium)
            }
        }
        .navigationBarBackButtonHidden(true)
        .background(Color.backgroundColor)
    }
}

struct MobileLoginScreen_Previews: PreviewProvider {
    static var previews: some View {
        MobileLoginScreen()
    }
}
