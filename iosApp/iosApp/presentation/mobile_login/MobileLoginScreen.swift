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
    var body: some View {
        ScrollView {
            VStack {
                Image("phone")
                    .resizable()
                    .frame(width: 130, height: 130)
                    .padding(.top, 36)
                
                Text("enter your")
                    .titleMediumStyle()
                    .foregroundColor(Color.onBackgroundColor.opacity(0.6))
                    .padding(.top, 16)
                
                ColorizedFirstCharText(
                    firstWord: "Mobile",
                    secondWord: "Number",
                    firstCharColor: Color.secondaryColor,
                    secondCharColor: Color.primaryContainerColor
                )
                .padding(.bottom, 20)
                
                Text("We will provide you with 4 digit verification code")
                    .multilineTextAlignment(.center)
                    .foregroundColor(Color.onBackgroundColor.opacity(0.8))
                    .padding(.horizontal, 30)
                
                PhoneTextField(text: phoneText)
                    .padding(.vertical, 16)
                    .padding(.horizontal, 20)
                
                Button("Send Code", action: {})
                    .buttonStyle(PrimaryButtonStyle())
                    .padding(.horizontal, 30)
                
                OrDivider()
                    .padding(.horizontal, 30)
                    .padding(.top, 42)
                
                Text("Use your regular accounts to quick connect")
                    .multilineTextAlignment(.center)
                    .foregroundColor(Color.onBackgroundColor.opacity(0.8))
                    .padding(.top, 22)
                    .padding(.horizontal, 30)
                
                HStack(spacing: 36) {
                    Image("google_icon")
                        .onTapGesture {
                            
                        }
                    Image("facebook_icon")
                        .onTapGesture {
                            
                        }
                    Image("apple_icon")
                        .onTapGesture {
                            
                        }
                }
                .padding(.top, 22)
                
                Spacer()
                    
            }
        }
        
        
    }
}

struct MobileLoginScreen_Previews: PreviewProvider {
    static var previews: some View {
        MobileLoginScreen()
    }
}
