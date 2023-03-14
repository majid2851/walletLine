//
//  OrDivider.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/21/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct OrDivider: View {
    var body: some View {
        HStack(alignment: .center) {
            Rectangle()
                .frame(height: Dimen.orDividerHeight)
                .foregroundColor(Color.secondaryContainerColor)
                .cornerRadius(Dimen.orDividerRadius, corners: [.topLeft, .bottomLeft])
                .offset(.init(width: 0, height: Dimen.orDividerOffset))

            Text(
                NSLocalizedString("or", comment: "")
            )
                .titleMediumStyle()
                .foregroundColor(Color.onBackgroundColor.opacity(0.8))

            Rectangle()
                .frame(height: Dimen.orDividerHeight)
                .foregroundColor(Color.secondaryContainerColor)
                .cornerRadius(Dimen.orDividerRadius, corners: [.topRight, .bottomRight])
                .offset(.init(width: 0, height: Dimen.orDividerOffset))
        }
    }
}

struct OrDivider_Previews: PreviewProvider {
    static var previews: some View {
        OrDivider()
    }
}

struct RoundedCorner: Shape {
    var radius: CGFloat = .infinity
    var corners: UIRectCorner = .allCorners

    func path(in rect: CGRect) -> Path {
        let path = UIBezierPath(roundedRect: rect, byRoundingCorners: corners, cornerRadii: CGSize(width: radius, height: radius))
        return Path(path.cgPath)
    }
}

extension View {
    func cornerRadius(_ radius: CGFloat, corners: UIRectCorner) -> some View {
        clipShape(RoundedCorner(radius: radius, corners: corners))
    }
}
