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
                    .frame(width: 130, height: 130)
                    .padding(.top, 36)
                
                LoginSubHeader(text: "enter your")
                    .padding(.top, 16)
                
                ColorizedFirstCharText(
                    firstWord: "Mobile",
                    secondWord: "Number",
                    firstCharColor: Color.secondaryColor,
                    secondCharColor: Color.primaryContainerColor
                )
                .titleLargeStyle()
                .padding(.bottom, 20)
                
                LoginBodyText(text: "We will provide you with 4 digit verification code")
                    .padding(.horizontal, 30)
                
                PhoneTextField(text: $phoneText, selected: $selectedCountry)
                    .padding(.vertical, 16)
                    .padding(.horizontal, 20)
                
                Button(
                    action: {
                        proceed = true
                    },
                    label: {
                        Text("Send Code")
                            .primaryButtonStyle()
                    }
                )
                .padding(.horizontal, 30)
                
                OrDivider()
                    .padding(.horizontal, 30)
                    .padding(.top, 42)
                
                LoginBodyText(text: "Use your regular accounts to quick connect")
                    .padding(.top, 22)
                    .padding(.horizontal, 30)
                
                HStack(spacing: 36) {
                    Image("google_icon")
                        .onTapGesture {}
                    Image("facebook_icon")
                        .onTapGesture {}
                    Image("apple_icon")
                        .onTapGesture {}
                }
                .padding(.top, 22)
            }
        }
    }
}

struct MobileLoginScreen_Previews: PreviewProvider {
    static var previews: some View {
        MobileLoginScreen()
    }
}
