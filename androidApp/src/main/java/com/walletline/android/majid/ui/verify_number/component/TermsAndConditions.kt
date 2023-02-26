package com.walletline.android.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_conditions_term
import com.walletline.android.android.presentation.wallet.theme.Black_CC
import com.walletline.android.android.presentation.wallet.theme.Green
import com.walletline.android.android.presentation.wallet.twoStyleText

@Preview
@Composable
fun TermsAndConditions()
{

    Text(
        text = twoStyleText(
            text1 = stringResource(id = R.string.term1)
            ,color1 = Black_CC
            , text2 = stringResource(id = R.string.term2),
            color2 = Green
        ),
        fontWeight = FontWeight(400),
        fontSize = mn_font_conditions_term,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(
            start = dimensionResource(id = R.dimen.paddingLarge),
            end = dimensionResource(id = R.dimen.paddingLarge),
            top = dimensionResource(id = R.dimen.paddingMedium))
    )


}