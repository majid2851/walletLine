package com.walletline.android.presentation.screens.auth.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.util.ThemePreviews
import com.walletline.android.presentation.util.appendSpace

@Composable
fun AuthTwoPartHeader(
    subHeaderText: String,
    mainHeaderFirstText: String,
    mainHeaderSecondText: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = subHeaderText,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
        )


        Text(
            text = colorizedFirstCharText(
                firstWord = mainHeaderFirstText,
                secondWord = mainHeaderSecondText,
                firstCharColor = MaterialTheme.colorScheme.secondary,
                secondCharColor = MaterialTheme.colorScheme.primaryContainer,
                commonColor = MaterialTheme.colorScheme.onBackground
            ),
            style = MaterialTheme.typography.titleLarge,
        )

    }

}

private fun colorizedFirstCharText(
    firstWord: String,
    secondWord: String,
    firstCharColor: Color,
    secondCharColor: Color,
    commonColor: Color,
): AnnotatedString {

    val firstWordFirstChar = firstWord.firstOrNull()?.toString() ?: ""
    val firstWordRest = firstWord.drop(1)
    val secondWordFirstChar = secondWord.firstOrNull()?.toString() ?: ""
    val secondWordRest = secondWord.drop(1)

    return buildAnnotatedString {

        withStyle(
            style = SpanStyle(color = firstCharColor)
        ) {

            append(firstWordFirstChar)
        }

        withStyle(
            style = SpanStyle(color = commonColor)
        ) {
            append(firstWordRest)
        }

        appendSpace()

        withStyle(
            style = SpanStyle(color = secondCharColor)
        ) {
            append(secondWordFirstChar)
        }

        withStyle(
            style = SpanStyle(color = commonColor)
        ) {

            append(secondWordRest)
        }
    }
}

@ThemePreviews
@Composable
fun AuthTwoPartHeaderPreview() {
    WalletLineTheme {
        WalletLineBackground {
            AuthTwoPartHeader(
                modifier = Modifier
                    .align(Alignment.Center),
                subHeaderText = stringResource(id = R.string.enterYour),
                mainHeaderFirstText = stringResource(R.string.mobile),
                mainHeaderSecondText = stringResource(R.string.number)
            )
        }
    }
}


