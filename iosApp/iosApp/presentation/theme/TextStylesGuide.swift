//
//  TextStylesGuide.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/18/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct TextStylesGuide: View {
    var body: some View {
        VStack(spacing: 30) {
            Text("System")
                .font(.largeTitle)
            
            Text("Title large")
                .titleLargeStyle()
            
            Text("Title Medium")
                .titleMediumStyle()
            
            Text("Title Small")
                .titleSmallStyle()
            
            Text("Body Medium")
                .bodyMediumStyle()
            
            Text("Body Small")
                .bodySmallStyle()
            
            Text("Label")
                .labelSmallStyle()
        }
    }
}

struct FontName {
    static let medium = "DMSans-Regular"
    static let bold = "DMSans-Bold"
}

struct TitleLargeStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.bold,
                    size: 35,
                    relativeTo: .title
                )
            )
    }
}

struct TitleMediumStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.bold,
                    size: 25,
                    relativeTo: .title2
                )
            )
    }
}

struct TitleSmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.medium,
                    size: 24,
                    relativeTo: .title3
                )
            )
    }
}

struct BodyLargeStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.bold,
                    size: 17,
                    relativeTo: .subheadline
                )
            )
    }
}

struct BodyMediumStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.medium,
                    size: 15,
                    relativeTo: .body
                )
            )
    }
}

struct BodySmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.bold,
                    size: 13,
                    relativeTo: .body
                )
            )
    }
}

struct LabelSmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    FontName.medium,
                    size: 12,
                    relativeTo: .footnote
                )
            )
    }
}

extension View {
    public func titleLargeStyle() -> some View {
        modifier(TitleLargeStyle())
    }
    public func titleMediumStyle() -> some View {
        modifier(TitleMediumStyle())
    }
    public func titleSmallStyle() -> some View {
        modifier(TitleSmallStyle())
    }
    public func bodyLargeStyle() -> some View {
        modifier(BodyLargeStyle())
    }
    public func bodyMediumStyle() -> some View {
        modifier(BodyMediumStyle())
    }
    public func bodySmallStyle() -> some View {
        modifier(BodySmallStyle())
    }
    public func labelSmallStyle() -> some View {
        modifier(LabelSmallStyle())
    }
}

struct TextStylesGuide_Previews: PreviewProvider {
    static var previews: some View {
        TextStylesGuide()
    }
}
