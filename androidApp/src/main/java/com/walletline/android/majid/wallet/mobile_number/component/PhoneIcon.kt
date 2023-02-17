package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun PhoneIcon()
{
    Box(
        modifier = Modifier
            .padding(top = dimensionResource(id = R.dimen.paddingLayouts10))
    )
    {
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_2),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.Center)
                .width(dimensionResource(id = R.dimen.phoneIconBackground))
        )

        Image(
            painter = painterResource(id = R.drawable.ic_vector),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.Center)
                .width(dimensionResource(id = R.dimen.phoneIcon))

        )
    }
}