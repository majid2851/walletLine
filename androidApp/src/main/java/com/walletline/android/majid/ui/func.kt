package com.walletline.android.android.presentation.wallet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle

fun multiStyleText(
    word1: String=""
    ,
    colorForFirstPartOfWord1: Color=Color.Transparent
    ,
    colorForSecondPartOfWord1: Color=Color.Transparent
    ,
    word2:String=""
    ,
    colorForFirstPartOfWord2: Color=Color.Transparent
    ,
    colorForSecondPartOfWord2:Color=Color.Transparent,
    word3:String="",
    colorForWord3:Color=Color.Transparent
):
        AnnotatedString {
    val sb= buildAnnotatedString {
        withStyle(style = SpanStyle(color = colorForFirstPartOfWord1,)) {
            val firstPartOfStr=word1.substring(0,1)

            append(firstPartOfStr)
        }
        withStyle(style = SpanStyle(color = colorForSecondPartOfWord1)) {
            val secondPartOfStr=word1.substring(1,word1.length)
            append(secondPartOfStr)
        }
        append(" ")
        withStyle(style = SpanStyle(color = colorForFirstPartOfWord2)) {
            val firstPartOfStr=word2.substring(0,1)

            append(firstPartOfStr)
        }
        withStyle(style = SpanStyle(color = colorForSecondPartOfWord2,)) {

            val secondPartOfStr=word2.substring(1,word2.length)
            append(secondPartOfStr)
        }
        withStyle(style = SpanStyle(color = colorForWord3)) {
            append(word3)
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
