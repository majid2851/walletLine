package com.walletline.ui.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import com.example.currencykotlin.model.di.component.FragmentComponent
import com.example.kotlin_wallet.ui.base.BaseFragment
import com.walletline.R
import com.walletline.databinding.FragmentSplashBinding
import com.walletline.model.utils.Utils
import com.walletline.viewmodel.SplashViewModel

class SplashFragment:BaseFragment<SplashViewModel,FragmentSplashBinding>()
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        startTimer()


    }
    fun startTimer()
    {
        object : CountDownTimer(Utils.SPLASH_DELAY, 1000)
        {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish()
            {
                navController!!.navigate(R.id.action_splashFragment_to_signInFragment)
            }
        }.start()
    }

    override fun init()
    {

    }

    override fun getLayout(): Int {
        return R.layout.fragment_splash
    }

    override fun setupComponent(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }


}