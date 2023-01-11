package com.walletline.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.walletline.R

class SignInActivity : AppCompatActivity() {

    var et_email: EditText? = null
    var et_password:EditText? = null
    var tv_signUp: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initViews()
    }

    fun initViews() {
        et_email = findViewById(R.id.et_emailSi)
        et_password = findViewById(R.id.et_passwordSi)
        tv_signUp = findViewById(R.id.tv_signup)
        val btn_signIn = findViewById<Button>(R.id.btn_signIn)
        btn_signIn.setOnClickListener { openMainActivity() }
        tv_signUp!!.setOnClickListener{ openSignUpActivity() }
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}