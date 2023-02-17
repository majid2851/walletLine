package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

sealed class Screen(val route:String)
{
    object Login:Screen("login")
    object TransferTask:Screen("transferTask")
    object ScanDialog:Screen("scanDialog")
    object SheetDialog:Screen("sheetDialog")
    object BankCard:Screen("bankCard")
    object VisaCard:Screen("visaCard")
    object MobileNumber:Screen("phoneNumber")
    object VerifyNumber:Screen("verifyNumber")
    object EntrancePattern:Screen("entrancePattern")
    object SocialRegister:Screen("socialRegister")



}