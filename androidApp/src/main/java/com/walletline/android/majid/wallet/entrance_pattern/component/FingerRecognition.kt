package com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green2
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_conditions_term
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_use_my_fingerprint

@Preview
@Composable
fun FingerRecognition()
{
    Row(modifier= Modifier
        .width(dimensionResource(id = R.dimen.fingerRecognitionRowWidth))
        .height(dimensionResource(id = R.dimen.fingerRecognitionRowHeight))
        .border(
            width = dimensionResource(id = R.dimen.border),
            color = Black,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.phoneFieldCorner),
            )
        )
        , verticalAlignment = Alignment.CenterVertically
    )
    {
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts7))
        )
        Image(painter =
        painterResource(id = R.drawable.ic___icon__finger_scan_)
            , contentDescription = ""

        )
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts10))
        )
        Text(
            text = stringResource(R.string.useMyFinger),
            color = Black_1C,
            fontWeight = FontWeight(700),
            fontSize = mn_font_use_my_fingerprint

        )
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts7))
        )

    }









}