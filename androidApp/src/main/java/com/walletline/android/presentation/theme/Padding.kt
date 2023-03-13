package com.walletline.android.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import com.walletline.android.presentation.util.sdp

object Padding {
    /** 4dp */
    val extraSmall: Dp @Composable get() = 4.sdp
    /** 8dp */
    val small: Dp @Composable get() = 8.sdp
    /**12dp*/
    val smallMedium: Dp @Composable get() = 12.sdp
    /** 16dp */
    val medium: Dp @Composable get() = 16.sdp
    /**24dp*/
    val extraMedium: Dp @Composable get() = 24.sdp
    /**32dp*/
    val smallLarge: Dp @Composable get() = 32.sdp
    /** 46dp */
    val large: Dp @Composable get() = 48.sdp
    /** 64dp */
    val extraLarge: Dp @Composable get() = 64.sdp
}

val LocalPadding = compositionLocalOf { Padding }

val MaterialTheme.padding: Padding
    @Composable
    @ReadOnlyComposable
    get() = LocalPadding.current