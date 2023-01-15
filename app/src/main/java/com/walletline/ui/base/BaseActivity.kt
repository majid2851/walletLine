package com.example.kotlin_wallet.ui.base

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.example.currencykotlin.model.di.component.ActivityComponent
import com.example.currencykotlin.model.di.component.DaggerActivityComponent
import com.example.currencykotlin.model.di.module.ActivityModule
import kotlinx.coroutines.launch
import javax.inject.Inject

abstract class BaseActivity<V: ViewModel,B: ViewDataBinding> : AppCompatActivity()
{

    @Inject
    lateinit var viewModel:V
    lateinit var b:B

//    @Inject
//    lateinit var pref: MySharedPref

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        b= DataBindingUtil.setContentView(this, getLayout())
        init()

        setupComponent(getComponent())
        vanishStatusbar()

    }

    fun getComponent(): ActivityComponent
    {
        val component= DaggerActivityComponent.builder()
            .activityModule(ActivityModule()).build()
        return component
    }
    fun vanishStatusbar( )
    {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                android.R.attr.windowFullscreen
            )
        }
    }




    abstract fun init()

    abstract fun getLayout():Int

    abstract fun setupComponent(component: ActivityComponent)

}