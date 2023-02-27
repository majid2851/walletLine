//
//  ColorGuide.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/19/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ColorGuide: View {
    var body: some View {
        Button {
        
        } label: {
            Text("Hello World")
        }.background(
            Capsule()
                .fill(Color.inverseSurfaceColor)
        )
    }
}

extension Color {
    
    public static let primaryColor: Color = Color("primary")
    public static let onPrimaryColor: Color = Color("onPrimary")
    public static let primaryContainerColor: Color = Color("primaryContainer")
    public static let onPrimaryContainerColor: Color = Color("onPrimaryContainer")
    
    public static let secondaryColor: Color = Color("secondary")
    public static let onSecondaryColor: Color = Color("onSecondary")
    public static let secondaryContainerColor: Color = Color("secondaryContainer")
    public static let onSecondaryContainerColor: Color = Color("onSecondaryContainer")
    
    public static let tertiaryColor: Color = Color("tertiary")
    public static let onTertiaryColor: Color = Color("onTertiary")
    public static let tertiaryContainerColor: Color = Color("tertiaryContainer")
    public static let onTertiaryContainerColor: Color = Color("onTertiaryContainer")
    
    public static let errorColor: Color = Color("error")
    public static let onErrorColor: Color = Color("onError")
    public static let errorContainerColor: Color = Color("errorContainer")
    public static let onErrorContainerColor: Color = Color("onErrorContainer")
    
    public static let surfaceColor: Color = Color("surface")
    public static let onSurfaceColor: Color = Color("onSurface")
    public static let surfaceVariantColor: Color = Color("surfaceVariant")
    public static let onSurfaceVariantColor: Color = Color("onSurfaceVariant")
    
    public static let backgroundColor: Color = Color("background")
    public static let onBackgroundColor: Color = Color("onBackground")
    
    public static let outlineColor: Color = Color("outline")
    public static let outlineVariantColor: Color = Color("outlineVariant")
    
    public static let inverseSurfaceColor: Color = Color("inverseSurface")
    public static let inverseOnSurfaceColor: Color = Color("inverseOnSurface")
    
    public static let inversePrimaryColor: Color = Color("inversePrimary")
}

struct ColorGuide_Previews: PreviewProvider {
    static var previews: some View {
        ColorGuide()
    }
}
