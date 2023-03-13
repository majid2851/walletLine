package com.walletline.android.android.presentation.wallet.social_register

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
import com.walletline.android.android.presentation.wallet.mobile_number.component.DescriptionTv
import com.walletline.android.android.presentation.wallet.mobile_number.component.Or
import com.walletline.android.android.presentation.wallet.mobile_number.component.PhoneField
import com.walletline.android.android.presentation.wallet.social_register.component.HeaderSocialRegister
import com.walletline.android.android.presentation.wallet.social_register.component.SignField
import com.walletline.android.android.presentation.wallet.social_register.component.SubmitPhoneNumber
import com.walletline.android.android.presentation.wallet.theme.Background

@Preview
@Composable
fun SocialRegister( )
{
    Column(modifier= Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
        .padding(dimensionResource(id = R.dimen.paddingAll)),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.marginTopEntrancePattern)))

        HeaderSocialRegister()


        DescriptionTv(desc = stringResource(R.string.toAccessEasily))

        Spacer(modifier = Modifier
            .height(dimensionResource(id = R.dimen.paddingMedium)))

        SignField(
            icon = R.drawable.ic_flat_color_icons_google,
            title = stringResource(R.string.signWithGoogle),
        )

        SignField(
            icon = R.drawable.facebook,
            title = stringResource(R.string.signWithFacebook)
        )

        SignField(
            icon = R.drawable.apple,
            title = stringResource(R.string.signWithApple)
        )

        Spacer(modifier = Modifier
            .height(dimensionResource(id = R.dimen.paddingVeryLarge)))
        Or()

        Spacer(modifier = Modifier
            .height(dimensionResource(id = R.dimen.paddingMedium)))
        DescriptionTv(desc = stringResource(R.string.usePhoneToLogin))


        PhoneField()

        SubmitPhoneNumber()
    }


}