package com.walletline.android.presentation.screens.auth.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.util.ThemePreviews

@Composable
fun AuthBodyText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium
) {
    Text(
        modifier = modifier,
        text = text,
        style = style,
        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
        textAlign = TextAlign.Center,
    )
}

@ThemePreviews
@Composable
fun AuthBodyTextPreview() {
    WalletLineTheme {
        WalletLineBackground {
            AuthBodyText(
                modifier = Modifier
                    .align(Alignment.Center),
                text = "Hello Walletline",
            )
        }
    }
}