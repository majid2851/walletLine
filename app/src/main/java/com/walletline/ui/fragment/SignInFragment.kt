package com.walletline.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.currencykotlin.model.di.component.FragmentComponent
import com.example.kotlin_wallet.ui.base.BaseFragment
import com.walletline.R
import com.walletline.databinding.FragmentSignInBinding
import com.walletline.viewmodel.SignInViewModel

class SignInFragment :BaseFragment<SignInViewModel,FragmentSignInBinding>()
{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        b.btnSignIn.setOnClickListener { onSignInClick() }
        b.tvSignup.setOnClickListener{ onSignupClick() }
    }


    fun onSignInClick()
    {

    }

    fun onSignupClick()
    {
        navController!!.navigate(R.id.action_signInFragment_to_signUpFragment)
    }

    override fun init() {

    }

    override fun getLayout(): Int {
        return R.layout.fragment_sign_in
    }

    override fun setupComponent(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }





}