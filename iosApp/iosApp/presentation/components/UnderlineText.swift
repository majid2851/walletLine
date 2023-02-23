//
//  UnderlineText.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/22/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct UnderlineText: View {
    let str: String
    let textColor: Color
    
    var attText: AttributedString {
        var attStr = AttributedString(str)
        attStr.underlineStyle = Text.LineStyle(
            pattern: .solid,
            color: textColor
        )
        
        attStr.foregroundColor = textColor
        
        return attStr
    }
    var body: some View {
        Text(attText)
    }
}

struct UnderlineText_Previews: PreviewProvider {
    static var previews: some View {
        UnderlineText(str: "Hello Word", textColor: Color.primaryColor)
    }
}
