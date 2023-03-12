package com.walletline.android.presentation.screens.auth.entrance_pattern.component

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
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.util.underlineText

@Composable
fun IgnoreSettingPatternSection(
    modifier: Modifier = Modifier,
    onIgnoreClick: () -> Unit
) {


    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        AuthBodyText(
            text = stringResource(id = R.string.preferLessSccure),
            style = MaterialTheme.typography.bodySmall
        )

        TextButton(onClick = onIgnoreClick) {
            Text(
                text = underlineText(
                    text = stringResource(id = R.string.ignoreSettingPattern),
                    color = MaterialTheme.colorScheme.primary
                ),
                style = MaterialTheme.typography.bodySmall
                    .copy(fontWeight = FontWeight.Bold),
            )
        }
    }
}