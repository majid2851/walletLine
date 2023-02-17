package com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_CC
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_desc
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_resend_code
import com.codingwithmitch.kmm_wms.android.presentation.wallet.twoStyleText

@Preview
@Composable
fun ResendCode()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier )
    {
        Text(text = twoStyleText(stringResource(R.string.didntReceiveCode)
            , color1 = Black_CC,
        ),
            fontWeight = FontWeight(400),
            fontSize = mn_font_desc,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()

        )
        Spacer(modifier = Modifier
            .height(dimensionResource(id = R.dimen.paddingLayouts4)))

        Text(text = twoStyleText(text2 = stringResource(R.string.resendCode),
            color2 = Green,),
            fontWeight = FontWeight(700),
            fontSize = mn_font_resend_code,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )



    }
}