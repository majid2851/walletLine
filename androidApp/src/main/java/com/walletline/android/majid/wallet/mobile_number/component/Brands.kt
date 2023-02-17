package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.codingwithmitch.kmm_wms.android.R

@Composable
fun Brands()
{
    Row(modifier=Modifier.padding(top = dimensionResource(id = R.dimen.brandsTopPadding)))
    {
        Image(painter = painterResource(id = R.drawable.ic_flat_color_icons_google) ,
            contentDescription ="",
        modifier= Modifier
            .padding(dimensionResource(id = R.dimen.brandIconPadding))
//            .width(dimensionResource(id = R.dimen.brandWidth))
        )

        Image(painter = painterResource(id = R.drawable.ic_flat_color_icons_google) ,
            contentDescription ="",
            modifier= Modifier
                .padding(dimensionResource(id = R.dimen.brandIconPadding))
//                .width(dimensionResource(id = R.dimen.brandWidth))
        )

        Image(painter = painterResource(id = R.drawable.ic_flat_color_icons_google) ,
            contentDescription ="",
            modifier= Modifier
                .padding(dimensionResource(id = R.dimen.brandIconPadding))
//                .width(dimensionResource(id = R.dimen.brandWidth))
        )

    }









}