package com.codingwithmitch.kmm_wms.android.presentation.wallet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle

fun multiStyleText(
    text1: String=""
    ,
    color1: Color=Color.Transparent
    ,
    text2:String=""
    ,
    color2: Color=Color.Transparent
    ,
    text3:String=""
    ,
    color3: Color=Color.Transparent
    ,
    text4:String=""
    ,
    color4:Color=Color.Transparent
):
        AnnotatedString {
    val sb= buildAnnotatedString {
        withStyle(style = SpanStyle(color = color1,)) {
            append(text1)
        }
        withStyle(style = SpanStyle(color = color2)) {
            append(text2)
        }
        append(" ")
        withStyle(style = SpanStyle(color = color3)) {
            append(text3)
        }
        withStyle(style = SpanStyle(color = color4,)) {
            append(text4)
        }
    }
    return sb
}

fun twoStyleText(
    text1: String=""
    ,
    color1: Color=Color.Transparent
    ,
    weight1:Int=400,
    textSpace:String=" ",
    text2:String=""
    ,
    color2: Color=Color.Transparent,
    weight2:Int=700

):
        AnnotatedString {
    val sb= buildAnnotatedString {
        withStyle(style = SpanStyle(color = color1, fontWeight = FontWeight(weight1))) {
            append(text1)
        }
        append(textSpace)
        withStyle(style = SpanStyle(color = color2,fontWeight=FontWeight(weight2),
            textDecoration = TextDecoration.Underline)) {
            append(text2)
        }

    }
    return sb
}
