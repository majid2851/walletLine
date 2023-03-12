package com.walletline.android.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.util.ThemePreviews

@Composable
fun WalletLineBackground(
    modifier: Modifier = Modifier,
    isScrollEnabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit,
) {
    val scrollState = rememberScrollState()
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(state = scrollState, enabled = isScrollEnabled)
    ) {
        content()
    }
}

@ThemePreviews
@Composable
fun WalletlineBackgroundPreviewTheme() {
    WalletLineTheme {
        WalletLineBackground {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = "Hello Walletline",
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}