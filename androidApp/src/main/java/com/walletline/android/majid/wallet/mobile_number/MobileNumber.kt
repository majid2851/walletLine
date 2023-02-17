package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Background
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component.*

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Preview
@Composable
fun MobileNumber()
{
    Column(modifier= Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
        .padding(dimensionResource(id = R.dimen.paddingAll)),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        PhoneIcon()

        Header()

        DescriptionTv(desc = stringResource(R.string.description))

        PhoneField()

        ButtonSubmit(title = stringResource(id = R.string.sendCode))

        Spacer(
            modifier = Modifier.height(
                dimensionResource(id = R.dimen.paddingOrTopBottom),
            )
        )
        Or()

        Spacer(
            modifier = Modifier.height(
                dimensionResource(id = R.dimen.paddingOrTopBottom),
            )
        )
        QuickConnectTitle()

        Brands()


    }




}


