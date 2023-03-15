//
//  LoginBodyText.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/23/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct AuthBodyText: View {
    let text: String
    var body: some View {
        Text(text)
            .multilineTextAlignment(.center)
            .foregroundColor(Color.onBackgroundColor.opacity(0.8))
            .bodyMediumStyle()
    }
}

struct LoginBodyText_Previews: PreviewProvider {
    static var previews: some View {
        AuthBodyText(text: "We will provide you with 4 digit verification code")
    }
}
