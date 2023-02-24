//
//  ButtonStylesGuide.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/21/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ButtonStylesGuide: View {
    var body: some View {
        VStack(spacing: 30) {
                    Text("Button Styles")
                        .titleLargeStyle()
                    
                    Button {
                    } label: {
                        Text("small primary")
                    }.buttonStyle(PrimaryButtonStyle())
                        .disabled(false)
                }
    }
}

struct PrimaryButtonStyle : ButtonStyle {
    @Environment(\.isEnabled) var isEnabled
    
    var backgroundColor: Color {
        isEnabled ? Color("primary") : Color("surfaceVariant")
    }
    
    var contentColor : Color {
        isEnabled ? Color.white : Color("grayTextColor")
    }
    
    func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .frame(maxWidth: .infinity)
            .bodyLargeStyle()
            .foregroundColor(contentColor)
            .padding(16)
            .background(
                RoundedRectangle(cornerRadius: 10)
                    .fill(backgroundColor)
            )
            
    }
}

struct ButtonStylesGuide_Previews: PreviewProvider {
    static var previews: some View {
        ButtonStylesGuide()
    }
}
