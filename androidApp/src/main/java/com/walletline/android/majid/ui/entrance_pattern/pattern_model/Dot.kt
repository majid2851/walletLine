package com.walletline.android.majid.ui.entrance_pattern.pattern_model

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

data class Dot (
    val id: Int,
    val offset: Offset,
    val size: Animatable<Float, AnimationVector1D>,
    var color: Color
)