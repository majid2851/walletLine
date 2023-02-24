//
//  LoginSubHeader.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/23/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct LoginSubHeader: View {
    let text: String
    var body: some View {
        Text(text)
            .titleMediumStyle()
            .foregroundColor(Color.onBackgroundColor.opacity(0.6))
    }
}

struct LoginSubHeader_Previews: PreviewProvider {
    static var previews: some View {
        LoginSubHeader(text: "enter your")
    }
}
