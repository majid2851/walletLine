//
//  SocialMediaButton.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/24/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct SocialMediaButton: View {
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
                .socialMediaButtonStyle()
            }
        )
    }
}

struct SocialMediaButton_Previews: PreviewProvider {
    static var previews: some View {
        SocialMediaButton(
            image: Image("facebook_icon"),
            text: "Sign in with Facebook"
        ) {}
    }
}
