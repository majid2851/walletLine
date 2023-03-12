package com.walletline.android.presentation.screens.auth.register_finish

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.walletline.android.presentation.navigation.AuthNavGraph

@AuthNavGraph
@Destination
@Composable
fun RegistrationFinishedScreen(
    navigator: DestinationsNavigator
) {

    RegistrationFinishedContent(
        onStartClick = {
        },
        onLinkSocialClicked = {}
    )
}