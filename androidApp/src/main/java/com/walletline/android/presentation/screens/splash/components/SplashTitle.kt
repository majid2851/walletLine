package com.walletline.android.presentation.screens.splash.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.walletline.android.R
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.DevicesPreviews
import com.walletline.android.presentation.util.ThemePreviews

@Composable
fun SplashTitle(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = stringResource(id = R.string.wallet),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
        Image(
            modifier = Modifier
                .padding(horizontal = MaterialTheme.padding.extraSmall)
                .width(Dimen.WalletLogoWidth)
                .height(Dimen.WalletLogoHeight)
                .offset(y = (-4).dp),

            painter = painterResource(id = R.drawable.ic_app),
            contentDescription = stringResource(R.string.desc_walletline_logo)

        )
        Text(
            text = stringResource(id = R.string.line),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = stringResource(id = R.string.plus),
            modifier = Modifier
                .padding(start = MaterialTheme.padding.extraSmall),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@ThemePreviews
@Composable
private fun SplashTitlePreviewTheme() {
    WalletLineTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {

            SplashTitle()
        }
    }
}

@DevicesPreviews
@Composable
private fun SplashTitlePreviewDevices() {
    WalletLineTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {

            SplashTitle()
        }
    }
}