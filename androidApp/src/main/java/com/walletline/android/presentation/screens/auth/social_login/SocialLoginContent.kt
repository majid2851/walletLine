package com.walletline.android.presentation.screens.auth.social_login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.screens.auth.components.AuthTwoPartHeader
import com.walletline.android.presentation.screens.auth.components.OrDivider
import com.walletline.android.presentation.screens.auth.components.PhoneTextField
import com.walletline.android.presentation.screens.auth.social_login.component.SocialSignInButton
import com.walletline.android.presentation.screens.auth.social_login.component.SubmitPhoneNumberButton
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.Country
import com.walletline.android.presentation.util.sdp

@Composable
fun SocialLoginContent(
    countries: List<Country>,
    selectedCountry: Country,
    phoneText: String,
    onPhoneTextChange: (String) -> Unit,
    onCountryChange: (id: Int) -> Unit,
    onSubmitPhoneClick: () -> Unit,
    onGoogleClicked: () -> Unit,
    onFacebookClicked: () -> Unit,
    onAppleClicked: () -> Unit,
) {

    WalletLineBackground {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(70.sdp))

            AuthTwoPartHeader(
                subHeaderText = stringResource(id = R.string.accessByYour),
                mainHeaderFirstText = stringResource(id = R.string.social),
                mainHeaderSecondText = stringResource(id = R.string.media)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.extraMedium))

            AuthBodyText(text = stringResource(id = R.string.toAccessEasily))

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            SocialSignInButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                icon = R.drawable.ic_google,
                text = stringResource(R.string.signWithGoogle),
                onClick = onGoogleClicked
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            SocialSignInButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                icon = R.drawable.ic_facebook,
                text = stringResource(R.string.signWithFacebook),
                onClick = onFacebookClicked
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            SocialSignInButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                icon = R.drawable.ic_apple,
                text = stringResource(R.string.signWithApple),
                onClick = onAppleClicked
            )

            Spacer(modifier = Modifier.height(157.sdp))


            OrDivider(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            AuthBodyText(text = stringResource(id = R.string.usePhoneToLogin))

            Spacer(modifier = Modifier.height(MaterialTheme.padding.smallMedium))

            PhoneTextField(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.medium),
                countries = countries,
                text = phoneText,
                onTextChange = onPhoneTextChange,
                onCountryChange = onCountryChange,
                selectedCountry = selectedCountry
            )

            SubmitPhoneNumberButton(
                onClick = onSubmitPhoneClick
            )
            Spacer(modifier = Modifier.height(MaterialTheme.padding.smallMedium))
        }
    }
}

@Preview
@Composable
fun SocialContentPreview() {
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
        SocialLoginContent(
            countries = countries,
            selectedCountry = selected,
            phoneText = text,
            onPhoneTextChange = { text = it },
            onCountryChange = { id ->
                countries.find {
                    it.id == id
                }?.let {
                    selected = it
                }
            },
            onSubmitPhoneClick = {},
            onGoogleClicked = {},
            onFacebookClicked = {},
            onAppleClicked = {},

        )
    }
}