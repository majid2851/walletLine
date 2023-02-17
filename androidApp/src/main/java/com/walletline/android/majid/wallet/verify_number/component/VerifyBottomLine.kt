package com.codingwithmitch.kmm_wms.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green5
import com.codingwithmitch.kmm_wms.android.R

@Composable
fun VerifyBottomLine()
{
    Box(modifier= Modifier
        .width(
            dimensionResource(id=R.dimen.verifyBottomLineWidth)
        )
        .height(dimensionResource(id = R.dimen.verifyBottomLineHeigth))
        .background(
            color = Green5,
            shape = RoundedCornerShape(dimensionResource(id = R.dimen.verifyBottomLineCorner))
        )
    )
    {

    }
}