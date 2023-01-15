package com.example.currencykotlin.model.di.module

import android.app.Application
import com.walletline.ui.fragment.SignInFragment
import com.walletline.viewmodel.SignInViewModel
import com.walletline.viewmodel.SignUpViewModel
import com.walletline.viewmodel.SplashViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FragmentModule()
{

    @Singleton
    @Provides
    fun splashViewModel():SplashViewModel{
        return SplashViewModel()
    }
    @Singleton
    @Provides
    fun signInViewModel():SignInViewModel{
        return SignInViewModel()
    }
    @Singleton
    @Provides
    fun signUpViewModel(): SignUpViewModel {
        return SignUpViewModel()
    }






}