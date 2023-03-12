package com.walletline.android.presentation.screens.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.walletline.android.presentation.util.appendSpace


@Composable
fun AuthHeader(
    firstWord: String,
    secondWord: String,
    thirdWord: String,
    modifier: Modifier = Modifier,
    firstWordColor: Color = MaterialTheme.colorScheme.secondary,
    secondWordColor: Color = MaterialTheme.colorScheme.onBackground,
    thirdWordColor: Color = MaterialTheme.colorScheme.primaryContainer,
) {

    Text(
        modifier = modifier
            .fillMaxWidth(),
        text = colorizedFirstAndLastWord(
            firstWord = firstWord,
            secondWord = secondWord,
            thirdWord = thirdWord,
            firstWordColor = firstWordColor,
            secondWordColor = secondWordColor,
            thirdWordColor = thirdWordColor,
        ),
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Center
    )
}

private fun colorizedFirstAndLastWord(
    firstWord: String,
    secondWord: String,
    thirdWord: String,
    firstWordColor: Color,
    secondWordColor: Color,
    thirdWordColor: Color,
): AnnotatedString {

    return buildAnnotatedString {

        withStyle(
            style = SpanStyle(color = firstWordColor)
        ) {

            append(firstWord)
        }

        appendSpace()

        withStyle(
            style = SpanStyle(color = secondWordColor)
        ) {
            append(secondWord)
        }

        withStyle(
            style = SpanStyle(color = thirdWordColor)
        ) {
            append(thirdWord)
        }
    }
}