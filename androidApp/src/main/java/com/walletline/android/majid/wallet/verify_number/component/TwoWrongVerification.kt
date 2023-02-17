package com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_CC
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_desc
import com.codingwithmitch.kmm_wms.android.presentation.wallet.twoStyleText

@Preview
@Composable
fun TwoWrongVerification()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            top = dimensionResource(id = R.dimen.paddingTopDesc),
            start = dimensionResource(id = R.dimen.paddingDesc),
            end = dimensionResource(id = R.dimen.paddingDesc),
        ))
    {
        Text(text = twoStyleText(
            text1 = stringResource(R.string.enter4DigitDesc),
            color1 = Black_1C,
            textSpace = "\n",
            text2 = stringResource(R.string.tools_phoneNumber),
            color2 = Green,
        ),
            fontWeight = FontWeight(400),
            fontSize = mn_font_desc,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()

        )




    }

}