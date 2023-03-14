//
//  SocialMediaIconsButton.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 3/13/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct SocialMediaIconButton: View {
    let image: Image
    let action: () -> Void
    var body: some View {
        Button(action: action, label: {
            image
        })
    }
}

struct SocialMediaIconsButton_Previews: PreviewProvider {
    static var previews: some View {
        SocialMediaIconButton(
            image: Image("google_icon")
        ) {
            
        }
    }
}
