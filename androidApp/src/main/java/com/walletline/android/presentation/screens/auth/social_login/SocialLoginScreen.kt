package com.walletline.android.presentation.screens.auth.social_login

import androidx.compose.runtime.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.walletline.android.presentation.navigation.AuthNavGraph
import com.walletline.android.presentation.screens.destinations.MobileLoginScreenDestination
import com.walletline.android.presentation.util.Country


@AuthNavGraph(start = true)
@Destination
@Composable
fun SocialLoginScreen(
    navigator: DestinationsNavigator
) {


    // FIXME: these 3 variables belongs to viewModel
    val countries by remember {
        mutableStateOf(
            listOf(
                Country(1, "NL +31"),
                Country(2, "IR +98"),
                Country(3, "US +1"),
            )
        )
    }
    var selectedCountry by remember { mutableStateOf(Country(1, "NL +31")) }
    var text by remember { mutableStateOf("") }

    SocialLoginContent(
        countries = countries,
        selectedCountry = selectedCountry,
        phoneText = text,
        onPhoneTextChange = { text = it },
        onCountryChange = { id ->
            countries.find {
                it.id == id
            }?.let {
                selectedCountry = it
            }
        },
        onSubmitPhoneClick = {
            navigator.navigate(MobileLoginScreenDestination)
        },
        onGoogleClicked = {},
        onFacebookClicked = {},
        onAppleClicked = {},
    )
}