package com.walletline.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencykotlin.model.di.component.ActivityComponent
import com.example.kotlin_wallet.ui.base.BaseActivity
import com.walletline.R
import com.walletline.databinding.ActivityMainBinding
import com.walletline.viewmodel.MainViewModel

class MainActivity : BaseActivity<MainViewModel,ActivityMainBinding>()
{
    override fun init() {

    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun setupComponent(component: ActivityComponent) {
        component.inject(this)
    }

}