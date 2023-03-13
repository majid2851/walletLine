package com.walletline.android.presentation.screens.auth.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.sdp

@Composable
fun OrDivider(
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .weight(1.5f)
                .height(Dimen.OrDividerLineHeight)
                .background(
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    shape = RoundedCornerShape(topStartPercent = 100, bottomStartPercent = 100)
                )
        )
        {}

        Box(
            modifier = Modifier
                .padding(horizontal = MaterialTheme.padding.smallMedium)
                .offset(y = -2.sdp)
        )
        {
            Text(
                text = stringResource(id = R.string.or),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.75f),
                textAlign = TextAlign.Center,
            )
        }

        Box(
            modifier = Modifier
                .weight(1.5f)
                .height(Dimen.OrDividerLineHeight)
                .background(
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    shape = RoundedCornerShape(topEndPercent = 100, bottomEndPercent = 100)
                )
        )
        {}
    }
}

@Preview
@Composable
fun OrDividerPreview() {
    WalletLineTheme {
        WalletLineBackground {
            OrDivider()
        }
    }
}