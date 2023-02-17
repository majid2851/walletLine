package com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.BLUE2
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green2
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green4
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_mobileNumber
import com.codingwithmitch.kmm_wms.android.presentation.wallet.multiStyleText

@Preview
@Composable
fun VerifyHeader()
{

    Text(
        text = multiStyleText(
            stringResource(R.string.verify),
            BLUE2,
            " ",
            Black_1C,
            stringResource(R.string.number),
            Black_1C
            , stringResource(id = R.string.wonder),
            Green4

        ),
        fontSize = mn_font_mobileNumber,
        fontWeight = FontWeight(700),
        color = Black_1C,
        modifier = Modifier)
}