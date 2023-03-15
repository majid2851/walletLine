//
//  EmbeddedUnderlineText.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/23/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct EmbeddedUnderlineText: View {
    let normalText: String
    let underlineText: String
    let textColor: Color
    let underlineTextColor: Color
    let normalTextFont: String
    let underlineTextFont: String
    let textSize: CGFloat
    
    var attText: AttributedString {
        var normalStr = AttributedString(normalText)
        normalStr.foregroundColor = textColor
        normalStr.font = .custom(normalTextFont, size: textSize)
        
        
        var underlineStr = AttributedString(underlineText)
        underlineStr.underlineStyle = Text.LineStyle(
            pattern: .solid,
            color: underlineTextColor
        )
        
        underlineStr.foregroundColor = underlineTextColor
        underlineStr.font = .custom(underlineTextFont, size: textSize)
        
        return normalStr + " " + underlineStr
    }
    var body: some View {
        Text(attText)
    }
}

struct EmbeddedUnderlineText_Previews: PreviewProvider {
    static var previews: some View {
        EmbeddedUnderlineText(
            normalText: "by clicking start you agree with our",
            underlineText: "Terms and Conditions",
            textColor: Color.onBackgroundColor,
            underlineTextColor: Color.primaryColor,
            normalTextFont: DMSans.medium,
            underlineTextFont: DMSans.bold,
            textSize: 13
        )
    }
}
