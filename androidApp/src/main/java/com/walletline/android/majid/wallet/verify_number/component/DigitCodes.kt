package com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_digit_num

@Composable
fun DigitCodes()
{
    LazyRow(modifier=Modifier.padding(top = dimensionResource(id = R.dimen.paddingLayouts30)))
    {
        items(4)
        {
            Column(modifier=Modifier.
                width(dimensionResource(id = R.dimen.digit_below_width))
                , horizontalAlignment = Alignment.CenterHorizontally

            )
            {
                BasicTextField(value = "0", onValueChange ={},
                    textStyle = TextStyle(fontSize = mn_font_digit_num,
                    fontWeight = FontWeight(700),
                    textAlign = TextAlign.Center,

                    )
                )
                Box(modifier = Modifier
                    .width(dimensionResource(id = R.dimen.digit_below_line))
                    .height(dimensionResource(id = R.dimen.digit_below_line_height))
                    .background(color = Black_1C)
                )
                {

                }
            }



        }
    }








}