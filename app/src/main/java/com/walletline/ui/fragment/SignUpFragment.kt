package com.walletline.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.currencykotlin.model.di.component.FragmentComponent
import com.example.kotlin_wallet.ui.base.BaseFragment
import com.walletline.R
import com.walletline.databinding.FragmentSignUpBinding
import com.walletline.viewmodel.SignUpViewModel

class SignUpFragment:BaseFragment<SignUpViewModel,FragmentSignUpBinding>()
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        b.btnSignUp.setOnClickListener{onSignUpClick()}
        b.tvSignIn.setOnClickListener {onSignInClick()}
    }

    private fun onSignUpClick() {

    }

    private fun onSignInClick()
    {
        requireActivity().onBackPressed()

    }

    override fun init() {

    }

    override fun getLayout(): Int {
        return R.layout.fragment_sign_up
    }

    override fun setupComponent(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }


}