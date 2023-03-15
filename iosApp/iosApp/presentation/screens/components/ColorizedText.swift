//
//  ColorizedText.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/22/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ColorizedText: View {
    let firstWord: String
    let secondWord: String
    var thirdWord: String? = nil
    let firstWordColor: Color
    let secondWordColor: Color
    var thirdWordColor: Color? = nil
    
    var str: AttributedString {
        var fWord = AttributedString(firstWord)
        fWord.foregroundColor = firstWordColor
        
        
        var sWord = AttributedString(secondWord)
        sWord.foregroundColor = secondWordColor
        
        var tWord = AttributedString(thirdWord ?? "")
        tWord.foregroundColor = thirdWordColor
        
        return fWord + " " + sWord + tWord
    }
    var body: some View {
        Text(str)
    }
}

struct ColorizedText_Previews: PreviewProvider {
    static var previews: some View {
        ColorizedText(
            firstWord: "Verify",
            secondWord: "Number",
            thirdWord: "!",
            firstWordColor: Color("secondary"),
            secondWordColor: Color("onBackground"),
            thirdWordColor: Color("primary")
        )
    }
}
