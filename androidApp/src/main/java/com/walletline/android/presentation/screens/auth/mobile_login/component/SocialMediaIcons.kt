package com.walletline.android.presentation.screens.auth.mobile_login.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding

@Composable
fun SocialMediaIcons(
    modifier: Modifier = Modifier,
    onGoogleClicked: () -> Unit,
    onFacebookClicked: () -> Unit,
    onAppleClicked: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        IconButton(
            onClick = onGoogleClicked
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = stringResource(R.string.desc_google_icon),
                modifier = Modifier
                    .size(Dimen.SocialMediaIconSize)
            )
        }

        Spacer(modifier = Modifier.padding(MaterialTheme.padding.smallMedium))

        IconButton(
            onClick = onFacebookClicked
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = stringResource(R.string.desc_facebook_icon),
                modifier = Modifier
                    .size(Dimen.SocialMediaIconSize)
            )
        }

        Spacer(modifier = Modifier.padding(MaterialTheme.padding.smallMedium))

        IconButton(
            onClick = onAppleClicked
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_apple),
                contentDescription = stringResource(R.string.desc_apple_icon),
                modifier = Modifier
                    .size(Dimen.SocialMediaIconSize)
            )
        }


    }


}

@Preview
@Composable
fun SocialMediasIconPreview() {
    WalletLineTheme {
        WalletLineBackground {
            SocialMediaIcons(
                onGoogleClicked = {},
                onFacebookClicked = {},
                onAppleClicked = {}

            )
        }
    }
}