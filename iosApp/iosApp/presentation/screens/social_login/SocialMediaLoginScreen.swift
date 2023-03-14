//
//  SocialMediaLoginScreen.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/23/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct SocialMediaLoginScreen: View {
    @State var phoneText: String = ""
    @State var selectedCountry: String = "NL +31"
    @State private var isNavActive = false
    var body: some View {
        ScrollView {
            NavigationLink(
                destination: MobileLoginScreen(),
                isActive: $isNavActive
            ) {
                EmptyView()
            }
            .hidden()
            VStack(alignment: .center, spacing: 0) {
                Group {
                    LoginSubHeader(
                        text: NSLocalizedString("access by your", comment: "")
                    )
                    .padding(.top, Padding.large)
                    
                    ColorizedFirstCharText(
                        firstWord: NSLocalizedString("Social", comment: ""),
                        secondWord: NSLocalizedString("Media", comment: ""),
                        firstCharColor: Color.secondaryColor,
                        secondCharColor: Color.primaryContainerColor
                    )
                    .titleLargeStyle()
                    .padding(.top, Padding.small)
                }
                
                AuthBodyText(
                    text: NSLocalizedString("to access easily by your known access", comment: "")
                )
                    .padding(.top, Padding.extraMedium)
                
                Group {
                    LeadingIconButton(
                        image: Image("google_icon"),
                        text: NSLocalizedString("Sign in with Google", comment: ""),
                        action: {}
                    )
                    
                    LeadingIconButton(
                        image: Image("facebook_icon"),
                        text: NSLocalizedString("Sign in with Facebook", comment: ""),
                        action: {}
                    )
                    
                    LeadingIconButton(
                        image: Image("apple_icon"),
                        text: NSLocalizedString("Sign in with Apple", comment: ""),
                        action: {}
                    )
                }
                .padding(.horizontal, Padding.extraMedium)
                .padding(.top, Padding.medium)
                
                Group {
                    OrDivider()
                        .padding(.top, Dimen.socialMediaMiddleMargin)
                    
                    AuthBodyText(
                        text: NSLocalizedString("Use your phone number to register or login", comment: "")
                    )
                        .padding(.top, Padding.small)
                }
                .padding(.horizontal, Padding.smallLarge)
                
                PhoneTextField(text: $phoneText, selected: $selectedCountry)
                    .padding(.horizontal, Padding.medium)
                    .padding(.top, Padding.medium)
                
                Button(action: {
                    isNavActive = true
                }, label: {
                    UnderlineText(
                        str: NSLocalizedString("Submit phone number", comment: ""),
                        textColor: Color.primaryColor
                    )
                    .boldBodyMediumStyle()
                    .padding(.top, Padding.medium)
                })
                
                
            }
        }
        .navigationBarBackButtonHidden(true)
        .background(Color.backgroundColor)
    }
}

struct SocialMediaLoginScreen_Previews: PreviewProvider {
    static var previews: some View {
        SocialMediaLoginScreen()
    }
}
