//
//  ColorizedFirstCharText.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/20/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ColorizedFirstCharText: View {
    let firstWord: String
    let secondWord: String
    let firstCharColor: Color
    let secondCharColor: Color
    
    var str: AttributedString {
        var firstWordFirstChar = AttributedString(firstWord.prefix(1))
        firstWordFirstChar.foregroundColor = firstCharColor
        
        let firstWordRest = AttributedString(firstWord.dropFirst(1))
        
        var secondWordFirstChar = AttributedString(secondWord.prefix(1))
        secondWordFirstChar.foregroundColor = secondCharColor
        
        let secondWordRest = AttributedString(secondWord.dropFirst(1))
        
        return firstWordFirstChar + firstWordRest + " " + secondWordFirstChar + secondWordRest
    }
    var body: some View {
        Text(str)
            .titleLargeStyle()
    }
}

struct ColorizedFirstCharText_Previews: PreviewProvider {
    static var previews: some View {
        ColorizedFirstCharText(
            firstWord: "Mobile",
            secondWord: "Number",
            firstCharColor: Color.secondaryColor,
            secondCharColor: Color.primaryContainerColor
        )
    }
}
