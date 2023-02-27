package com.walletline.android.majid.ui.entrance_pattern.pattern_model


interface ComposeLockCallback {
    fun onStart(dot: Dot)
    fun onDotConnected(dot: Dot)
    fun onResult(result:List<Dot>)
}