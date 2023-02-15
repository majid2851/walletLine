package com.walletline.android

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

/* TODO: Change to actual color based on design system */
private val WalletLineDarkColorScheme = darkColorScheme(
    primary = Color.White,
    secondary = Color.White,
    background = Color.White,
    tertiary = Color.White
)

/* TODO: Change to actual color based on design system */
private val WalletLineLightColorScheme = lightColorScheme(
    primary = Color.White,
    primaryContainer = Color.White,
    secondary = Color.White,
    secondaryContainer = Color.White,
    background = Color.White,
    tertiary = Color.White,


    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

/* TODO: Change to actual theme based on design system */
@Composable
fun WalletLineTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> WalletLineDarkColorScheme
        else -> WalletLineLightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val activity = view.context as Activity
            activity.window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(activity.window, view).isAppearanceLightStatusBars =
                darkTheme
        }
    }

//    val spacing = Spacing()
//    val gradient = Gradient()

    CompositionLocalProvider(
//        LocalSpacing provides spacing,
//        LocalGradient provides gradient
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
//            typography = Typography,
            content = content
        )
    }

}
