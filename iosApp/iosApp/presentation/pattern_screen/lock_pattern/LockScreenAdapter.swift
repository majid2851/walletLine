//
//  LockScreenAdapter.swift
//  iosApp
//
//  Created by Mostafa Hosseini on 2/26/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct LockScreenAdapter: UIViewRepresentable {
    typealias UIViewType = LockScreen
    var frame: CGRect = CGRect(x: -100, y: -100, width: 300, height: 300)
    let action: (Double, [Int]) -> Void
    
    
    func makeUIView(context: Context) -> LockScreen {
        // Return LockScreen instance.
        var config = LockScreen.Config()
        config.lineColor = UIColor(Color.secondaryContainerColor)
        config.circleHighlightColor = UIColor(Color.surfaceVariantColor)
        config.circleOuterRingColor = UIColor.clear
        config.circleInnerRingColor = UIColor(Color.surfaceVariantColor)
        config.lineEdgeColor = UIColor(Color.secondaryContainerColor)
        config.lineWidth = 3
        
        return LockScreen(
            frame: frame,
            size: 3,
            allowClosedPattern: false,
            config: config,
            handler: action
        )
    }
    
    func updateUIView(_ uiView: LockScreen, context: Context) {
        // Updates the state of the specified view with new information from SwiftUI.
    }
    
}

struct LockScreenAdapter_Previews: PreviewProvider {
    static var previews: some View {
        VStack {
            LockScreenAdapter(action: {_,_ in})
                .background(content: {
                    Rectangle()
                        .fill(.red)
                })
                .border(.blue)
            Text("Hello")
            Spacer()
        }
        
    }
}
