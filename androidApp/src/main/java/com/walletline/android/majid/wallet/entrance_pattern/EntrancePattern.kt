package com.walletline.android.android.presentation.wallet.entrance_pattern

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
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Background
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.entrance_pattern.component.EntrancePatternHeader
import com.walletline.android.android.presentation.wallet.entrance_pattern.component.FingerRecognition
import com.walletline.android.android.presentation.wallet.entrance_pattern.component.IgnoreSettingPattern_Tv
import com.walletline.android.android.presentation.wallet.mobile_number.component.ButtonSubmit
import com.walletline.android.android.presentation.wallet.mobile_number.component.Or
import com.walletline.android.majid.wallet.entrance_pattern.component.PasswordPattern


@Composable
fun EntrancePattern(onSubmitPatternClick:()->Unit)
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
        
        EntrancePatternHeader()

        PasswordPattern()

        ButtonSubmit(onClick = {onSubmitPatternClick()}
            , title = stringResource(id = R.string.submitPattern))
        
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.paddingLayouts10)))
        
        Or()

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.paddingLayouts10)))

        FingerRecognition()
//
        Spacer(modifier = Modifier
            .fillMaxHeight()
            .weight(1.0f))

       IgnoreSettingPattern_Tv()





    }












}