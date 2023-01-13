package com.example.currencykotlin.model.di.component

import com.example.currencykotlin.model.di.module.FragmentModule
import com.walletline.ui.fragment.SignInFragment
import com.walletline.ui.fragment.SignUpFragment
import com.walletline.ui.fragment.SplashFragment
import dagger.Component
import javax.inject.Singleton

@Component(modules = [FragmentModule::class])
@Singleton
interface FragmentComponent
{
    fun inject(fragment:SplashFragment)
    fun inject(fragment:SignInFragment)
    fun inject(fragment: SignUpFragment)




}