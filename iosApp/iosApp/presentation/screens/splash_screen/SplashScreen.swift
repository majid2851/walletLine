//
//  SplashScreen.swift
//  iosApp
//
//  Created by Paria on 12/13/1401 AP.
//  Copyright © 1401 AP orgName. All rights reserved.
//

import SwiftUI

struct SplashScreen: View {
    let timer = Timer.publish(every: 1, on: .main, in: .common).autoconnect()
    @State private var timeRemain = 2
    @State private var isNavActive = false
    var body: some View {
        ZStack {
            NavigationLink(
                destination: SocialMediaLoginScreen(),
                isActive: $isNavActive
            ) {
                EmptyView()
            }
            .onReceive(timer) { _ in
                timeRemain -= 1
                if timeRemain == 0 {
                    isNavActive = true
                }
            }
            .hidden()

            VStack(spacing: 0) {
                Spacer()
                HStack(spacing: 0) {
                    Text(
                        NSLocalizedString("Wallet", comment: "wallet")
                    ).titleLargeStyle()

                    Image("wallet_icon")
                        .frame(width: Dimen.walletlineLogoWidth, height: Dimen.walletlineLogoHeight)
                        .padding(EdgeInsets(top: 0, leading: Padding.small, bottom: Padding.extraMedium, trailing: Padding.small))

                    Text(
                        NSLocalizedString("Line", comment: "Line")
                    ).titleLargeStyle()

                    Text("+")
                        .foregroundColor(Color.secondaryColor)
                        .titleLargeStyle()
                }
                .frame(alignment: .top)
                

                Text(
                    NSLocalizedString("manage your wallet easily!", comment: "")
                )
                .foregroundColor(Color.onSurfaceColor)
                .titleSmallStyle()
                .multilineTextAlignment(.center)

                Spacer()
                Spacer()
                HStack(spacing: Padding.small) {
                    Text(
                        NSLocalizedString("Created by", comment: "")
                    )
                    .foregroundColor(Color.onSurfaceColor)
                    .titleSmallStyle()

                    Image("heart_icon")
                        .frame(width: Dimen.heartIconSize, height: Dimen.heartIconSize)
                }.frame(alignment: .bottom)
            }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .background(
            LinearGradient(
                gradient: Gradient(colors: [Color.onPrimaryColor, Color.surfaceVariantColor]),
                startPoint: .top,
                endPoint: .bottom
            )
        )
    }
}

struct SplashScreen_Previews: PreviewProvider {
    static var previews: some View {
        SplashScreen()
    }
}
