package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Gray_60
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_quick_connect

@Preview
@Composable
fun QuickConnectTitle()
{
    Box(modifier=Modifier.width(dimensionResource(id = R.dimen.quickConnectWidth)))
    {
        Text(text = stringResource(id = R.string.quickConnect),
        color = Gray_60, fontSize = mn_font_quick_connect,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight(400)
        )



    }








}