package com.example.currencykotlin.model.di.module

import android.app.Application
import android.content.Context
import com.walletline.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule()
{

    @Singleton
    @Provides
    fun mainViewModel(): MainViewModel {
        return MainViewModel()
    }






}