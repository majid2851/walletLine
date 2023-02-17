package com.codingwithmitch.kmm_wms.android.presentation.wallet.social_register.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.*
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_enterYour
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_mobileNumber
import com.codingwithmitch.kmm_wms.android.presentation.wallet.multiStyleText

@Preview
@Composable
fun HeaderSocialRegister()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            stringResource(id = R.string.accessByYour),
            fontSize = mn_font_enterYour,
            fontWeight = FontWeight(700),
            color = Gray_60,
            modifier = Modifier )


        Text(
            text = multiStyleText(
                stringResource(R.string.s),
                BLUE2,
                stringResource(R.string.ocial),
                Black_1C,
                stringResource(R.string.m),
                Green
                , stringResource(R.string.edia),
                Black_1C
            ),
            fontSize = mn_font_mobileNumber,
            fontWeight = FontWeight(700),
            color = Black_1C,
            modifier = Modifier )

    }

}