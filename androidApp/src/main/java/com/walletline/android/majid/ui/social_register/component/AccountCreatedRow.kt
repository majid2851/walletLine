package com.walletline.android.majid.ui.social_register.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.walletline.android.R

@Composable
fun AccountCreatedRow(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.account),
            style = TextStyle(
                color = Color(0xFF1C1939),
                fontSize = 35.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier.padding(end = 4.dp)
        )
        Text(
            text = stringResource(R.string.created),
            style = TextStyle(
                color = Color(0xFF60D3AA),
                fontSize = 35.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Center,
            ),
        )
    }
}