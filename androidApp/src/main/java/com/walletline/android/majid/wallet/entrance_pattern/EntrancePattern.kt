package com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation.Screen
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.*
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.component.EntrancePatternHeader
import com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.component.FingerRecognition
import com.codingwithmitch.kmm_wms.android.presentation.wallet.entrance_pattern.component.IgnoreSettingPattern_Tv
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component.ButtonSubmit
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component.Or
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_enterYour
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_mobileNumber
import com.codingwithmitch.kmm_wms.android.presentation.wallet.multiStyleText
import com.codingwithmitch.kmm_wms.android.presentation.wallet.twoStyleText

@Preview
@Composable
fun EntrancePattern()
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

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(350.dp))

        ButtonSubmit(title = stringResource(id = R.string.submitPattern))
        
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