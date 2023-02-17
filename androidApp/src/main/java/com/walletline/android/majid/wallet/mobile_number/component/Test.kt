package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun Test()
{
    Box(modifier=Modifier.fillMaxWidth().height(50.dp))
    {
        TextField(value = "",
            onValueChange = {},modifier= Modifier
                .fillMaxWidth().align(Alignment.Center)
                .fillMaxHeight(),
            label = { Text(stringResource(R.string.phoneNumberHint)) },

            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
            ),
        )
    }
}