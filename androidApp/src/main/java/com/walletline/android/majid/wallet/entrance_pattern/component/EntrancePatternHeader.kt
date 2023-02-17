package com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
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
fun EntrancePatternHeader()
{
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            stringResource(id = R.string.setYourOwn),
            fontSize = mn_font_enterYour,
            fontWeight = FontWeight(700),
            color = Gray_60,
            modifier = Modifier )


        Text(
            text = multiStyleText(
                stringResource(R.string.e),
                BLUE2,
                stringResource(R.string.ntrance),
                Black_1C,
                stringResource(R.string.p),
                Orange
                , stringResource(R.string.attern),
                Black_1C
            ),
            fontSize = mn_font_mobileNumber,
            fontWeight = FontWeight(700),
            color = Black_1C,
            modifier = Modifier )

    }


}