package com.walletline.android.android.presentation.wallet.verify_number.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_mobileNumber
import com.walletline.android.android.presentation.wallet.multiStyleText
import com.walletline.android.android.presentation.wallet.theme.BLUE2
import com.walletline.android.android.presentation.wallet.theme.Black_1C
import com.walletline.android.android.presentation.wallet.theme.Green4

@Preview
@Composable
fun VerifyHeader()
{

    Text(
        text = multiStyleText(
            stringResource(R.string.verify),
            BLUE2,
            BLUE2,
            stringResource(R.string.number),
            Black_1C,
            Black_1C,
            word3 = stringResource(id = R.string.wonderSign),
            colorForWord3 = Green4
        ),
        fontSize = mn_font_mobileNumber,
        fontWeight = FontWeight(700),
        color = Black_1C,
        modifier = Modifier)
}