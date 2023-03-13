package com.walletline.android.presentation.screens.auth.mobile_login

import androidx.compose.runtime.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.walletline.android.presentation.navigation.AuthNavGraph
import com.walletline.android.presentation.screens.destinations.VerifyNumberScreenDestination
import com.walletline.android.presentation.util.Country

@AuthNavGraph
@Destination
@Composable
fun MobileLoginScreen(
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
    var phoneText by remember { mutableStateOf("") }
    var errormessage: String? by remember { mutableStateOf(null) }

    MobileLoginContent(
        countries = countries,
        selectedCountry = selectedCountry,
        phoneText = phoneText,
        phoneErrorMessage = errormessage,
        onPhoneTextChange = {
            phoneText = it
        },
        onCountryChange = { id ->
            selectedCountry = countries.first { it.id == id }
        },
        onSendCodeClick = {
            // FIXME: Error show case, error handling should happen in shared module
            if (phoneText.length < 10) {
                errormessage = "Phone number length should be 10"

            } else {
                errormessage = null
                navigator.navigate(VerifyNumberScreenDestination)
            }

        },
        onGoogleClicked = {},
        onFacebookClicked = {},
        onAppleClicked = {},

        )

}


