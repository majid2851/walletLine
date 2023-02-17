package com.codingwithmitch.kmm_wms.android.presentation.wallet.social_register.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_desc
import com.codingwithmitch.kmm_wms.android.presentation.wallet.twoStyleText

@Composable
fun SubmitPhoneNumber()
{
    Text(text = twoStyleText(
        text2 = stringResource(R.string.submitPhoneNumber),
        color2 = Green,
    ),
        fontWeight = FontWeight(700),
        fontSize = mn_font_desc,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()

    )
}