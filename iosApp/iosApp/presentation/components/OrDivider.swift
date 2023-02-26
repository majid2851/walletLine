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
            Capsule()
                .frame(width: .infinity, height: 5)
                .offset(.init(width: 0, height: 2))
                .foregroundColor(Color.secondaryContainerColor)
                
            Text("or")
                .titleMediumStyle()
                .foregroundColor(Color.onBackgroundColor.opacity(0.8))
            
            Capsule()
                .frame(width: .infinity, height: 5)
                .offset(.init(width: 0, height: 2))
                .foregroundColor(Color.secondaryContainerColor)
        }
    }
}

struct OrDivider_Previews: PreviewProvider {
    static var previews: some View {
        OrDivider()
    }
}
