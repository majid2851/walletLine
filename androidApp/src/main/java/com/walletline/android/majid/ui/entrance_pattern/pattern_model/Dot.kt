package com.walletline.android.majid.ui.entrance_pattern.pattern_model

data class Dot(
    val rowIndex:Float=0.0F,
    val columnIndex:Float=0.0F,
    val leftPoint:Int=0,
    val rightPoint:Int=0,
    val topPoint:Int=0,
    val bottomPoint:Int=0,
    val key:String ?=null
)
