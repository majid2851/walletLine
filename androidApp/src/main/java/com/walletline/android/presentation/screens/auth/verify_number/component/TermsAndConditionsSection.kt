package com.walletline.android.presentation.screens.auth.verify_number.component

import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.util.appendSpace

@Composable
fun TermsAndConditionsSection(
    modifier: Modifier = Modifier,
    onTermsClicked: () -> Unit
) {

    val annotatedString = partiallyHyperlinkText(
        normalSection = stringResource(id = R.string.term1),
        hyperlinkSection = stringResource(id = R.string.term2),
        normalSectionColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
        hyperlinkColor = MaterialTheme.colorScheme.primary
    )

    ClickableText(
        modifier = modifier,
        text = annotatedString,
        style = MaterialTheme.typography.bodySmall.copy(textAlign = TextAlign.Center),
        onClick = { offset ->
            annotatedString.getStringAnnotations(
                tag = "terms",
                start = offset,
                end = offset
            ).takeIf {
                it.isNotEmpty()
            }?.let {
//                Log.d("Clicked", "TermsAndConditions: ")
                onTermsClicked()
            }
        }
    )
}

private fun partiallyHyperlinkText(
    normalSection: String,
    hyperlinkSection: String,
    normalSectionColor: Color,
    hyperlinkColor: Color
): AnnotatedString = buildAnnotatedString {

    withStyle(
        style = SpanStyle(
            color = normalSectionColor,
            fontWeight = FontWeight.Medium
        )
    ) {
        append(normalSection)
    }

    appendSpace()

    pushStringAnnotation(
        tag = "terms",
        annotation = "terms"
    )

    withStyle(
        style = SpanStyle(
            color = hyperlinkColor,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold
        )
    ) {
        append(hyperlinkSection)
    }
    pop()
}

@Preview
@Composable
fun TermsPreview() {
    WalletLineTheme {
        WalletLineBackground {
            TermsAndConditionsSection() {

            }
        }
    }
}