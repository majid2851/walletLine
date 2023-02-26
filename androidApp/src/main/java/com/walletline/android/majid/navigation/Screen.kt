

sealed class Screen(val route:String)
{
    object MobileNumber:Screen("phoneNumber")
    object VerifyNumber:Screen("verifyNumber")
    object EntrancePattern:Screen("entrancePattern")
    object SocialRegister:Screen("socialRegister")

    object RegistrationFinished:Screen("registrationFinished")



}