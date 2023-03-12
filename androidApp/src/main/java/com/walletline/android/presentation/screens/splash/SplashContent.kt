package com.walletline.android.presentation.screens.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.walletline.android.R
import com.walletline.android.presentation.screens.splash.components.SplashFooter
import com.walletline.android.presentation.screens.splash.components.SplashTitle
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.ThemePreviews

@Composable
fun SplashContent(
    modifier: Modifier = Modifier
) {

    val gradientFirstColor = MaterialTheme.colorScheme.background
    val gradientSecondColor = MaterialTheme.colorScheme.surfaceVariant

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                drawRect(
                    Brush.linearGradient(
                        colors = listOf(
                            gradientFirstColor,
                            gradientSecondColor,
                        ),
                        start = Offset(x = size.width, y = 0f),
                        end = Offset(x = 0f, y = size.height),
                    )
                )
            },
    ) {

        Spacer(modifier = Modifier.weight(0.5f))

        SplashTitle()

        Text(
            text = stringResource(id = R.string.manage_wallet),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.weight(1f))

        SplashFooter(
            modifier = modifier
                .padding(bottom = MaterialTheme.padding.large)
        )
    }
}

@ThemePreviews
@Composable
fun SplashScreenPreviewTheme() {
    WalletLineTheme {
        SplashContent()
    }
}