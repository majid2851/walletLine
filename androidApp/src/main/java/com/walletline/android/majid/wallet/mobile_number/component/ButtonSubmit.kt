package com.walletline.android.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.White
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_submit

@Composable
fun ButtonSubmit(onClick:()->Unit,title:String="")
{
    Button(modifier= Modifier
        .padding(
            start = dimensionResource(R.dimen.paddingLayouts10),
            end = dimensionResource(R.dimen.paddingLayouts10)
        )
        .fillMaxWidth()
        .height(dimensionResource(id = R.dimen.buttonSubmitHeight))
        .background(
            color = Green,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.cornerOfButtonSubmit)
            )
        )
        , onClick = onClick
        , colors = ButtonDefaults.
                buttonColors(containerColor =Color.Transparent)
    )
    {
        Text(text = title,
            textAlign = TextAlign.Center, color =White,
            modifier = Modifier
                .fillMaxWidth()
                ,fontSize =mn_font_submit
            , fontWeight = FontWeight(700)

        )
    }



}