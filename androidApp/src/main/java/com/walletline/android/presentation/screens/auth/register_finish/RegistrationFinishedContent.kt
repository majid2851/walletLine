package com.walletline.android.presentation.screens.auth.register_finish

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.screens.auth.components.AuthButton
import com.walletline.android.presentation.screens.auth.components.AuthHeader
import com.walletline.android.presentation.screens.auth.social_login.component.AccountRecoverySection
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding

@Composable
fun RegistrationFinishedContent(
    onStartClick: () -> Unit,
    onLinkSocialClicked: () -> Unit
) {

    WalletLineBackground {

        Image(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(x = Dimen.CloudImageXOffset, y = -(Dimen.CloudImageYOffset))
                .size(
                    width = Dimen.CloudImageWidth,
                    height = Dimen.CloudImageHeight
                ),
            painter = painterResource(id = R.drawable.im_color_cloud),
            contentDescription = stringResource(R.string.desc_cloud)
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(Dimen.RegisterTopMargin))

            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(
                        width = Dimen.WhaleImageWidth,
                        height = Dimen.WhaleImageHeight
                    ),
                painter = painterResource(id = R.drawable.im_whale),
                contentDescription = stringResource(R.string.desc_whale_icon)
            )

            Spacer(modifier = Modifier.height(Dimen.RegisterBelowImageMargin))

            AuthHeader(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                firstWord = stringResource(id = R.string.account),
                secondWord = stringResource(id = R.string.created),
                thirdWord = stringResource(id = R.string.exclamation_mark),
                firstWordColor = MaterialTheme.colorScheme.onBackground,
                secondWordColor = MaterialTheme.colorScheme.primary,
                thirdWordColor = MaterialTheme.colorScheme.secondary
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            AuthBodyText(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                text = stringResource(R.string.account_created_message)
            )

            Spacer(modifier = Modifier.height(Dimen.RegisterMiddleMargin))

            AuthButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                height = Dimen.StartButtonHeight,
                text = stringResource(id = R.string.start_fun),
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
                onClick = onStartClick
            )
            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            AccountRecoverySection(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.large),
                onLinkClicked = onLinkSocialClicked
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))
        }
    }
}

@Preview
@Composable
fun RegisterFinishedPreview() {
    WalletLineTheme {
        RegistrationFinishedContent(
            onStartClick = {},
            onLinkSocialClicked = {}

        )
    }
}