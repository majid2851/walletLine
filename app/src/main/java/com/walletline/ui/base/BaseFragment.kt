package com.example.kotlin_wallet.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.currencykotlin.model.di.component.DaggerFragmentComponent
import com.example.currencykotlin.model.di.component.FragmentComponent
import com.example.currencykotlin.model.di.module.FragmentModule
import javax.inject.Inject


abstract class BaseFragment<V: ViewModel,B: ViewDataBinding>() : Fragment()
{
    @Inject
    lateinit var viewModel:V
    lateinit var b:B
//    @Inject
//    lateinit var pref:MySharedPref

    var navController: NavController?=null



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setupComponent(getComponent())

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)


    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        b= DataBindingUtil.inflate(inflater,getLayout(),container,false)
            init()

        return b.root

    }


    fun getComponent(): FragmentComponent {

        val component= DaggerFragmentComponent.builder()
            .fragmentModule(FragmentModule()).build()
        return component
    }



    abstract fun init()

    abstract fun getLayout():Int

    abstract fun setupComponent(fragmentComponent: FragmentComponent)



}
