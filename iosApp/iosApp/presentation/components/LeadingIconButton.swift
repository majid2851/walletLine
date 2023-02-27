//
//  SocialMediaButton.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/24/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct LeadingIconButton: View {
    var radius: CGFloat = 50
    let image: Image
    let text: String
    let action: () -> Void
    var body: some View {
        Button(
            action: action,
            label: {
                ZStack {
                    HStack {
                        image
                        Spacer()
                    }
                    Text(text)
                }
                .socialMediaButtonStyle(radius: radius)
            }
        )
    }
}

struct SocialMediaButton_Previews: PreviewProvider {
    static var previews: some View {
        LeadingIconButton(
            image: Image("facebook_icon"),
            text: "Sign in with Facebook"
        ) {
            
        }
    }
}
