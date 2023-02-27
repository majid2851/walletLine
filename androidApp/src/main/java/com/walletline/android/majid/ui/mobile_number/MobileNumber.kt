package com.walletline.android.android.presentation.wallet.mobile_number

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.component.Brands
import com.walletline.android.android.presentation.wallet.mobile_number.component.ButtonSubmit
import com.walletline.android.android.presentation.wallet.mobile_number.component.DescriptionTv
import com.walletline.android.android.presentation.wallet.mobile_number.component.Header
import com.walletline.android.android.presentation.wallet.mobile_number.component.Or
import com.walletline.android.android.presentation.wallet.mobile_number.component.PhoneField
import com.walletline.android.android.presentation.wallet.mobile_number.component.PhoneIcon
import com.walletline.android.android.presentation.wallet.mobile_number.component.QuickConnectTitle
import com.walletline.android.android.presentation.wallet.theme.Background
@Preview
@Composable
fun MobileNumber(onSendCodeClick:()->Unit=TODO())
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

        ButtonSubmit(
            onClick=onSendCodeClick,
            title = stringResource(id = R.string.sendCode)
        )

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


