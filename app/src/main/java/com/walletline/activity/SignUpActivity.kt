package com.walletline.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.walletline.R

class SignUpActivity : AppCompatActivity() {
    var et_fullName: EditText? =  null
    var et_email:EditText? = null
    var et_password:EditText? = null
    var et_cpassword:EditText? = null
    var tv_signIn: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
    }

    fun initViews() {
        et_email = findViewById(R.id.et_emailSU)
        et_password = findViewById(R.id.et_passwordSU)
        tv_signIn = findViewById(R.id.tv_signIn)
        val btn_signUp = findViewById<Button>(R.id.btn_signUp)
        btn_signUp.setOnClickListener { openMainActivity() }
        tv_signIn!!.setOnClickListener(View.OnClickListener { openSignInActivity() })
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun openSignInActivity() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}