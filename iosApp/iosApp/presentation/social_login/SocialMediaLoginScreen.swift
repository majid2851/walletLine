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
    var body: some View {
        ScrollView {
            VStack {
                Group {
                    LoginSubHeader(text: "access by your")
                        .padding(.top, 48)
                    
                    ColorizedFirstCharText(
                        firstWord: "Social",
                        secondWord: "Media",
                        firstCharColor: Color.secondaryColor,
                        secondCharColor: Color.primaryContainerColor
                    )
                    .titleLargeStyle()
                }
                .padding(.horizontal, 80)
                
                LoginBodyText(text: "to access easily by your known access")
                    .padding(.horizontal, 16)
                    .padding(.top, 1)
                
                Group {
                    LeadingIconButton(
                        image: Image("google_icon"),
                        text: "Sign in with Google",
                        action: {}
                    )
                    
                    LeadingIconButton(
                        image: Image("facebook_icon"),
                        text: "Sign in with Facebook",
                        action: {}
                    )
                    
                    LeadingIconButton(
                        image: Image("apple_icon"),
                        text: "Sign in with Apple",
                        action: {}
                    )
                }
                .padding(.horizontal, 22)
                .padding(.top, 15)
                
                Group {
                    OrDivider()
                        .padding(.top, 120)
                    
                    LoginBodyText(text: "Use your phone number to register or login")
                        .padding(.top, 8)
                }
                .padding(.horizontal, 30)
                
                PhoneTextField(text: $phoneText, selected: $selectedCountry)
                    .padding(.horizontal, 18)
                
                UnderlineText(
                    str: "Submit phone number",
                    textColor: Color.primaryColor
                )
                .boldBodyMediumStyle()
                .padding(.top, 10)
            }
        }
        .navigationBarBackButtonHidden(true)
    }
}

struct SocialMediaLoginScreen_Previews: PreviewProvider {
    static var previews: some View {
        SocialMediaLoginScreen()
    }
}
