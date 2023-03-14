//
//  DimenGuide.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 3/13/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct DimenGuide: View {
    var body: some View {
        Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
    }
}

struct Dimen {
    public static let splashTopMargin: CGFloat = 217
    public static let heartIconSize: CGFloat = 24
    public static let walletlineLogoWidth: CGFloat = 64
    public static let walletlineLogoHeight: CGFloat = 59
    public static let phoneIconSize: CGFloat = 130
    public static let mobileVerifyTopMargin: CGFloat = 109
    public static let socialMediaMiddleMargin: CGFloat = 120
    public static let orDividerHeight: CGFloat = 5
    public static let orDividerRadius: CGFloat = 50
    public static let orDividerOffset: CGFloat = 2
    public static let registerBgWidth: CGFloat = 408
    public static let registerBgHeight: CGFloat = 280
    public static let registerBgOffsetWidth: CGFloat = 60
    public static let registerBgOffsetHeight: CGFloat = -210
    public static let lockPatternHeight: CGFloat = 400
    public static let lockPatternWidth: CGFloat = 425
    public static let RegisterFinishedMiddleMargin: CGFloat = 170
}

struct DimenGuide_Previews: PreviewProvider {
    static var previews: some View {
        DimenGuide()
    }
}
