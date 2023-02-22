package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.walletline.android.android.presentation.wallet.mobile_number.MobileNumber
import com.walletline.android.android.presentation.wallet.entrance_pattern.EntrancePattern
import com.walletline.android.android.presentation.wallet.social_register.SocialRegister
import com.walletline.android.android.presentation.wallet.verify_number.VerifyNumber
import com.walletline.android.majid.ui.social_register.RegistrationFinished

@Preview
@Composable
fun Navigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController,
        startDestination = Screen.RegistrationFinished.route)
    {

        composable(route = Screen.MobileNumber.route)
        {
            MobileNumber(onSendCodeClick = { navController.navigate(Screen.VerifyNumber.route)})
        }
        composable(route = Screen.VerifyNumber.route)
        {
            VerifyNumber(onProceedClick = { navController.navigate(Screen.EntrancePattern.route)})
        }

        composable(route = Screen.EntrancePattern.route)
        {
            EntrancePattern(onSubmitPatternClick =
                { navController.navigate(Screen.SocialRegister.route)}
            )
        }
        composable(route = Screen.SocialRegister.route)
        {
            SocialRegister()
        }

        composable(route = Screen.RegistrationFinished.route)
        {
            RegistrationFinished()
        }

    }


}