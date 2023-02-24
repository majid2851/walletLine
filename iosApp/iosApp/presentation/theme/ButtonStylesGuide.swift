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
            
            Button {} label: {
                Text("small primary")
                    .primaryButtonStyle()
            }
            .disabled(true)
            
            Button {} label: {
                ZStack {
                    HStack {
                        Image("apple_icon")
                        Spacer()
                    }
                    Text("small primary")
                }
                .socialMediaButtonStyle()
            }
        }
    }
}

struct PrimaryButtonStyle: ViewModifier {
    @Environment(\.isEnabled) var isEnabled
    
    var backgroundColor: Color {
        isEnabled ? Color.primaryColor : Color.primaryColor.opacity(0.6)
    }
    
    var contentColor: Color {
        isEnabled ? Color.onPrimaryColor : Color.onPrimaryColor.opacity(0.6)
    }

    func body(content: Content) -> some View {
        content
            .frame(maxWidth: .infinity)
            .bodyLargeStyle()
            .foregroundColor(contentColor)
            .padding(16)
            .background(
                RoundedRectangle(cornerRadius: 10, style: .continuous)
                    .fill(backgroundColor)
            )
    }
}

struct SocialMediaButtonStyle: ViewModifier {
    @Environment(\.isEnabled) var isEnabled
    
    var backgroundColor: Color {
        isEnabled ? Color.white : Color.white.opacity(0.6)
    }
    
    var contentColor: Color {
        isEnabled ? Color.onBackgroundColor : Color.onBackgroundColor.opacity(0.6)
    }

    func body(content: Content) -> some View {
        content
            .frame(maxWidth: .infinity)
            .frame(height: 48)
            .bodyLargeStyle()
            .foregroundColor(contentColor)
            .padding(.horizontal, 14)
            .background(
                Capsule(style: .continuous)
                    .stroke(Color.onBackgroundColor)
            )
    }
}

extension View {
    public func primaryButtonStyle() -> some View {
        modifier(PrimaryButtonStyle())
    }
    public func socialMediaButtonStyle() -> some View {
        modifier(SocialMediaButtonStyle())
    }
}

struct ButtonStylesGuide_Previews: PreviewProvider {
    static var previews: some View {
        ButtonStylesGuide()
    }
}
