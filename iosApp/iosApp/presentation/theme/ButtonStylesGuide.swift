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
                Text("small primary")
                    .startButtonStyle()
            }
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

struct StartButtonStyle: ViewModifier {
    @Environment(\.isEnabled) var isEnabled
    
    var backgroundColor: Color {
        isEnabled ? Color.tertiaryColor : Color.primaryColor.opacity(0.6)
    }
    
    var contentColor: Color {
        isEnabled ? Color.onPrimaryColor : Color.onPrimaryColor.opacity(0.6)
    }

    func body(content: Content) -> some View {
        content
            .frame(maxWidth: .infinity)
            .frame(height:56)
            .bodyLargeStyle()
            .foregroundColor(contentColor)
            .background(
                RoundedRectangle(cornerRadius: 10, style: .continuous)
                    .fill(backgroundColor)
            )
    }
}
struct SocialMediaButtonStyle: ViewModifier {
    @Environment(\.isEnabled) var isEnabled
    var radius: CGFloat = 50
    
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
                RoundedCorner(radius: radius)
                    .stroke(Color.onBackgroundColor)
            )
    }
}

extension View {
    public func primaryButtonStyle() -> some View {
        modifier(PrimaryButtonStyle())
    }
    public func startButtonStyle() -> some View {
        modifier(StartButtonStyle())
    }
    public func socialMediaButtonStyle(radius: CGFloat = 50) -> some View {
        modifier(SocialMediaButtonStyle(radius: radius))
    }
}

struct ButtonStylesGuide_Previews: PreviewProvider {
    static var previews: some View {
        ButtonStylesGuide()
    }
}
