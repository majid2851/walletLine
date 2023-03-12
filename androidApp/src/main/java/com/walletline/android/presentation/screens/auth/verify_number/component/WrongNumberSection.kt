package com.walletline.android.presentation.screens.auth.verify_number.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.util.underlineText
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.util.ThemePreviews

@Composable
fun WrongNumberSection(
    modifier: Modifier = Modifier,
    isVisible: Boolean = true,
    onChangeClick: () -> Unit,
) {

    AnimatedVisibility(
        visible = isVisible,
        enter = expandVertically(),
        exit = shrinkVertically(),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            AuthBodyText(text = stringResource(id = R.string.wrongNumber))

            TextButton(onClick = onChangeClick) {
                Text(
                    text = underlineText(
                        text = stringResource(id = R.string.changeIt),
                        color = MaterialTheme.colorScheme.primary
                    ),
                    style = MaterialTheme.typography.bodyMedium
                        .copy(fontWeight = FontWeight.Bold),
                )
            }
        }
    }
}

@ThemePreviews
@Composable
fun WrongNumberPreview() {
    WalletLineTheme {
        WalletLineBackground {
            WrongNumberSection(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {

            }
        }
    }
}