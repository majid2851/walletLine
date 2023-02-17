package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.White
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_submit

@Preview
@Composable
fun ButtonSubmit(title:String="")
{
    Box(modifier=Modifier
        .padding(
            start = dimensionResource(R.dimen.paddingLayouts10),
             end = dimensionResource(R.dimen.paddingLayouts10))
        .fillMaxWidth()
        .height(dimensionResource(id = R.dimen.buttonSubmitHeight))
        .background(
            color = Green,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.cornerOfButtonSubmit)
            )
        ),
    )
    {
        Text(text = title,
            textAlign = TextAlign.Center, color =White,
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                    ,

            fontSize =mn_font_submit
            , fontWeight = FontWeight(700)

        )
    }



}