package com.walletline.android.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_desc
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_resend_code
import com.walletline.android.android.presentation.wallet.theme.Black_CC
import com.walletline.android.android.presentation.wallet.theme.Green
import com.walletline.android.android.presentation.wallet.twoStyleText

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
            .height(dimensionResource(id = R.dimen.paddingVerySmall)))

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