package com.walletline.android.presentation.screens.auth.entrance_pattern.component.pattern_model


interface ComposeLockCallback {
    fun onStart(dot: Dot)
    fun onDotConnected(dot: Dot)
    fun onResult(result:List<Dot>, dotIdAsPassword: String)
}