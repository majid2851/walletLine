package com.walletline.android.presentation.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle

fun underlineText(
    text: String,
    color: Color,
): AnnotatedString = buildAnnotatedString {
    withStyle(
        style = SpanStyle(
            color = color,
            textDecoration = TextDecoration.Underline
        )
    ) {
        append(text)
    }
}