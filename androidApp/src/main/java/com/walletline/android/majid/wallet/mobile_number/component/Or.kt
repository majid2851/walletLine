package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.*
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_or

@Preview
@Composable
fun Or()
{
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = dimensionResource(id = R.dimen.paddingLayouts10),
                end = dimensionResource(id = R.dimen.paddingLayouts10),
            ),
    )
    {

        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)
            .height(dimensionResource(id = R.dimen.or_line_height))
            .background(
                color = Green3, shape =
                RoundedCornerShape(dimensionResource(id = R.dimen.orBoxCorner))
            ))
        {

        }

        Box(modifier= Modifier
            .background(color = Background)
            .align(Alignment.Center))
        {
            Text(text = stringResource(id = R.string.or),
                fontSize = mn_font_or,
                fontWeight = FontWeight(700),
                color = Gray_66,
                textAlign = TextAlign.Center,
                modifier= Modifier
                    .align(Alignment.Center)
                    .width(dimensionResource(id = R.dimen.orWidth)))
        }




    }










}