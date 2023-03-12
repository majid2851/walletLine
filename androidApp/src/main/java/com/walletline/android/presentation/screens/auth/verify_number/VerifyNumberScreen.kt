package com.walletline.android.presentation.screens.auth.verify_number

import androidx.compose.runtime.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.walletline.android.presentation.navigation.AuthNavGraph
import com.walletline.android.presentation.screens.destinations.EntrancePatternScreenDestination

@AuthNavGraph
@Destination
@Composable
fun VerifyNumberScreen(
    navigator: DestinationsNavigator
) {

    var otp by remember {
        mutableStateOf("")
    }

    var isProceedEnabled by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(otp) {
        isProceedEnabled = otp.length == 4
    }

    VerifyNumberContent(
        otp = otp,
        isProceedEnabled = isProceedEnabled,
        onOtpChange = { otp = it },
        onChangeNumberClick = {},
        onResendCodeClick = {},
        onProceedButtonClick = {
            navigator.navigate(EntrancePatternScreenDestination)
        },
        onTermsClicked = {},
    )

}

