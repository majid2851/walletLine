package com.walletline.android.presentation.screens.auth.verify_number.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.walletline.android.R
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.util.underlineText

@Composable
fun ResendCodeSection(
    modifier: Modifier = Modifier,
    isVisible: Boolean = false,
    onResendClick: () -> Unit,
) {
    AnimatedVisibility(
        visible = isVisible,
        enter = expandVertically(),
        exit = shrinkVertically(),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AuthBodyText(text = stringResource(R.string.didntReceiveCode))

            TextButton(onClick = onResendClick) {
                Text(
                    text = underlineText(
                        text = stringResource(R.string.resendCode),
                        color = MaterialTheme.colorScheme.primary
                    ),
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}
