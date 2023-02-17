package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codingwithmitch.kmm_wms.android.presentation.SheetDialog
import com.codingwithmitch.kmm_wms.android.presentation.excersize.bank_card.BankCard
import com.codingwithmitch.kmm_wms.android.presentation.excersize.login_page.LoginScreen
import com.codingwithmitch.kmm_wms.android.presentation.excersize.login_page.LoginViewModel
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.MobileNumber
import com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog.ScanDialog
import com.codingwithmitch.kmm_wms.android.presentation.excersize.transfer_task.TransferTaskScreen
import com.codingwithmitch.kmm_wms.android.presentation.excersize.transfer_task.TransferTaskViewModel
import com.codingwithmitch.kmm_wms.android.presentation.excersize.visa_card.VisaCard
import com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.EntrancePattern
import com.codingwithmitch.kmm_wms.android.presentation.wallet.social_register.SocialRegister
import com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.VerifyNumber

@Preview
@Composable
fun Navigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SocialRegister.route)
    {
        composable(route = Screen.Login.route)
        {
            val factory= HiltViewModelFactory(LocalContext.current, navBackStackEntry = it)
            val myViewModel: LoginViewModel = viewModel(key = "LoginViewModel",factory)

            LoginScreen(state = myViewModel.state.value,
                onTrigerEvent = {myViewModel.trigerEvent(it)},)
        }

        composable(route = Screen.TransferTask.route)
        {
            val factory= HiltViewModelFactory(LocalContext.current, navBackStackEntry = it)
            val myViewModel: TransferTaskViewModel = viewModel(key = "TransferTaskViewModel",factory)

            TransferTaskScreen()
        }

        composable(route = Screen.ScanDialog.route)
        {
            ScanDialog()
        }
        composable(route = Screen.SheetDialog.route)
        {
            SheetDialog()
        }
        composable(route = Screen.BankCard.route)
        {
            BankCard()
        }
        composable(route = Screen.VisaCard.route)
        {
            VisaCard()
        }
        composable(route = Screen.MobileNumber.route)
        {
            MobileNumber()
        }
        composable(route = Screen.VerifyNumber.route)
        {
            VerifyNumber()
        }

        composable(route = Screen.EntrancePattern.route)
        {
            EntrancePattern()
        }
        composable(route = Screen.SocialRegister.route)
        {
            SocialRegister()
        }



    }


}