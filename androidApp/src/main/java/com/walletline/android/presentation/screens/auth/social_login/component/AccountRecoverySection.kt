package com.walletline.android.presentation.screens.auth.social_login.component

import androidx.compose.foundation.layout.Column
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
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.util.underlineText

@Composable
fun AccountRecoverySection(
    modifier: Modifier = Modifier,
    onLinkClicked: () -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        AuthBodyText(text = stringResource(R.string.account_recovery))

        TextButton(onClick = onLinkClicked) {
            Text(
                text = underlineText(
                    text = stringResource(R.string.link_profile),
                    color = MaterialTheme.colorScheme.primary
                ),
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
            )
        }
    }
}