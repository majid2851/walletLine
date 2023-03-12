package com.walletline.android.presentation.screens.auth.social_login.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.walletline.android.R
import com.walletline.android.presentation.util.underlineText

@Composable
fun SubmitPhoneNumberButton(
    onClick: () -> Unit
)
{
    TextButton(onClick = onClick) {
        Text(
            text = underlineText(
                text = stringResource(R.string.submitPhoneNumber),
                color = MaterialTheme.colorScheme.primary
            ),
            style = MaterialTheme.typography.bodySmall
        )
    }
}