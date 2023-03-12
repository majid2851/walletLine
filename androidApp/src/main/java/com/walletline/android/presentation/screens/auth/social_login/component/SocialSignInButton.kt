package com.walletline.android.presentation.screens.auth.social_login.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.sdp

@Composable
fun SocialSignInButton(
    @DrawableRes icon: Int,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {

    Surface(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(50),
        color = Color.Transparent,
        contentColor = MaterialTheme.colorScheme.onBackground,
        border = BorderStroke(
            width = 1.sdp,
            color = MaterialTheme.colorScheme.onBackground
        ),
        interactionSource = remember { MutableInteractionSource() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = MaterialTheme.padding.smallMedium,
                    vertical = MaterialTheme.padding.small
                ),
        ) {

            Image(
                modifier = Modifier
                    .size(Dimen.SocialMediaIconSize)
                    .align(Alignment.CenterStart),
                painter = painterResource(id = icon),
                contentDescription = text,
            )

            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview
@Composable
fun SocialSignInPreview() {
    WalletLineTheme {
        WalletLineBackground {
            SocialSignInButton(
                icon = R.drawable.ic_apple,
                text = "Sign in with apple",
                onClick = {}
            )
        }
    }
}