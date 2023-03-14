//
//  PaddingGuide.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 3/13/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct PaddingGuide: View {
    var body: some View {
        Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
    }
}

struct Padding {
    /// 0
    public static let defaultPadd: CGFloat = 0
    /// 4
    public static let extraSmall: CGFloat = 4
    /// 8
    public static let small: CGFloat = 8
    /// 12
    public static let smallMedium: CGFloat = 12
    /// 16
    public static let medium: CGFloat = 16
    /// 24
    public static let extraMedium: CGFloat = 24
    /// 32
    public static let smallLarge: CGFloat = 32
    /// 48
    public static let large: CGFloat = 48
    /// 64
    public static let extraLarge: CGFloat = 64
}

struct PaddingGuide_Previews: PreviewProvider {
    static var previews: some View {
        PaddingGuide()
    }
}
