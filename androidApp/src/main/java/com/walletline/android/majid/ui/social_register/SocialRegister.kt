package com.walletline.android.android.presentation.wallet.social_register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.*
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.component.DescriptionTv
import com.walletline.android.android.presentation.wallet.mobile_number.component.Or
import com.walletline.android.android.presentation.wallet.mobile_number.component.PhoneField
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_enterYour
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_mobileNumber
import com.walletline.android.android.presentation.wallet.multiStyleText
import com.walletline.android.android.presentation.wallet.social_register.component.HeaderSocialRegister
import com.walletline.android.android.presentation.wallet.social_register.component.SignField
import com.walletline.android.android.presentation.wallet.social_register.component.SubmitPhoneNumber

@Preview
@Composable
fun SocialRegister()
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
            .height(dimensionResource(id = R.dimen.paddingLayouts10)))

        SignField(
            icon = R.drawable.ic_flat_color_icons_google,
            title = stringResource(R.string.signWithGoogle)
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
            .height(dimensionResource(id = R.dimen.paddingLayouts30)))
        Or()

        Spacer(modifier = Modifier
            .height(dimensionResource(id = R.dimen.paddingLayouts10)))
        DescriptionTv(desc = stringResource(R.string.usePhoneToLogin))


        PhoneField()

        SubmitPhoneNumber()
    }


}