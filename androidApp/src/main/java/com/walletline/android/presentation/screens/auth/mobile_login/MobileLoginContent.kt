package com.walletline.android.presentation.screens.auth.mobile_login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.*
import com.walletline.android.presentation.screens.auth.mobile_login.component.SocialMediaIcons
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.Country
import com.walletline.android.presentation.util.ThemePreviews
import com.walletline.android.presentation.util.sdp

@Composable
fun MobileLoginContent(
    countries: List<Country>,
    selectedCountry: Country,
    phoneText: String,
    phoneErrorMessage: String? = null,
    onPhoneTextChange: (String) -> Unit,
    onCountryChange: (id: Int) -> Unit,
    onSendCodeClick: () -> Unit,
    onGoogleClicked: () -> Unit,
    onFacebookClicked: () -> Unit,
    onAppleClicked: () -> Unit,
) {

    val focusManager = LocalFocusManager.current
    val interactionSource = remember { MutableInteractionSource() }

    WalletLineBackground {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    interactionSource = interactionSource,
                    indication = null
                ) { focusManager.clearFocus() },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(MaterialTheme.padding.smallLarge))

            Image(
                painter = painterResource(
                    // FIXME: Should support user manual dark theme settings 
                    id = if (!isSystemInDarkTheme()) R.drawable.im_phone_icon
                    else R.drawable.im_phone_icon_dark
                ),
                contentDescription = stringResource(R.string.desc_phone_icon),
                modifier = Modifier
                    .size(Dimen.PhoneIconSize)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.small))

            AuthTwoPartHeader(
                subHeaderText = stringResource(id = R.string.enterYour),
                mainHeaderFirstText = stringResource(id = R.string.mobile),
                mainHeaderSecondText = stringResource(id = R.string.number)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.extraMedium))

            AuthBodyText(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.extraMedium),
                text = stringResource(R.string.mobile_number_desc)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.extraMedium))

            PhoneTextField(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.medium),
                countries = countries,
                text = phoneText,
                errorMessage = phoneErrorMessage,
                onTextChange = onPhoneTextChange,
                onCountryChange = onCountryChange,
                selectedCountry = selectedCountry,
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            AuthButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.extraMedium),
                onClick = onSendCodeClick,
                text = stringResource(id = R.string.sendCode),
                height = 54.sdp
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            OrDivider(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.extraMedium)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.extraMedium))

            AuthBodyText(
                modifier = Modifier
                    .padding(horizontal = Dimen.AuthBodyTextLargePadding),
                text = stringResource(id = R.string.quickConnect)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.smallMedium))

            SocialMediaIcons(
                onGoogleClicked = onGoogleClicked,
                onFacebookClicked = onFacebookClicked,
                onAppleClicked = onAppleClicked
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.smallMedium))
        }
    }
}

@ThemePreviews
@Composable
fun MobileNumberPreviewTheme() {
    val countries by remember {
        mutableStateOf(
            listOf(
                Country(1, "NL +31"),
                Country(2, "IR +98"),
                Country(3, "US +1"),
            )
        )
    }
    var selected by remember { mutableStateOf(Country(1, "NL +31")) }
    var text by remember { mutableStateOf("") }
    WalletLineTheme {
        MobileLoginContent(
            countries = countries,
            selectedCountry = selected,
            phoneText = text,
            onCountryChange = { id ->
                countries.find {
                    it.id == id
                }?.let {
                    selected = it
                }
            },
            onPhoneTextChange = { text = it },
            onSendCodeClick = {},
            onGoogleClicked = {},
            onFacebookClicked = {},
            onAppleClicked = {},
        )
    }
}