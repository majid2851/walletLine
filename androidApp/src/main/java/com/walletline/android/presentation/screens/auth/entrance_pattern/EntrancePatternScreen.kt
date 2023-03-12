package com.walletline.android.presentation.screens.auth.entrance_pattern

import androidx.compose.runtime.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.walletline.android.presentation.navigation.AuthNavGraph
import com.walletline.android.presentation.screens.destinations.RegistrationFinishedScreenDestination

@AuthNavGraph
@Destination
@Composable
fun EntrancePatternScreen(
    navigator: DestinationsNavigator
) {

    var pattern by remember {
        mutableStateOf("")
    }

    var isSubmitEnabled by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(pattern) {
        isSubmitEnabled = pattern.length >= 4
    }

    EntrancePatternContent(
        isSubmitEnabled = isSubmitEnabled,
        onSubmitPatternClick = {
            navigator.navigate(RegistrationFinishedScreenDestination)
        },
        onPatternResult = {
            pattern = it
        },
        onUseSensorClick = {},
        onIgnoreSettingClick = {},

        )
}