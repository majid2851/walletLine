package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.walletline.android.android.presentation.wallet.mobile_number.MobileNumber
import com.walletline.android.android.presentation.wallet.entrance_pattern.EntrancePattern
import com.walletline.android.android.presentation.wallet.social_register.SocialRegister
import com.walletline.android.android.presentation.wallet.verify_number.VerifyNumber
import com.walletline.android.majid.ui.entrance_pattern.EntrancePatternViewModel

@Preview
@Composable
fun Navigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController,
        startDestination = Screen.MobileNumber.route)
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
        {navBackStackEntry ->
//            val factory= HiltViewModelFactory(LocalContext.current,navBackStackEntry)
//            val myViewModel: EntrancePatternViewModel = viewModel(key="EntrancePatternViewModel",
//                factory = factory)
            EntrancePattern() { navController.navigate(Screen.SocialRegister.route) }
        }
        composable(route = Screen.SocialRegister.route)
        {
            SocialRegister()
        }



    }


}