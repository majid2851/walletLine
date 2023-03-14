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

struct DMSans {
    static let medium = "DMSans-Regular"
    static let bold = "DMSans-Bold"
}

struct TitleLargeStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.bold,
                    size: 35,
                    relativeTo: .title
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct TitleMediumStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.bold,
                    size: 25,
                    relativeTo: .title2
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct TitleSmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.medium,
                    size: 24,
                    relativeTo: .title3
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct BodyLargeStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.bold,
                    size: 17,
                    relativeTo: .subheadline
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct BodyMediumStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.medium,
                    size: 15,
                    relativeTo: .body
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct BoldBodyMediumStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.bold,
                    size: 15,
                    relativeTo: .body
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct BodySmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.bold,
                    size: 13,
                    relativeTo: .body
                )
            )
            .lineSpacing(Padding.small)
    }
}

struct LabelSmallStyle: ViewModifier {
    func body(content: Content) -> some View {
        content
            .font(
                .custom(
                    DMSans.medium,
                    size: 12,
                    relativeTo: .footnote
                )
            )
            .lineSpacing(Padding.small)
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
    public func boldBodyMediumStyle() -> some View {
        modifier(BoldBodyMediumStyle())
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
