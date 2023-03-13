package com.walletline.android.majid.ui.register_finished.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.walletline.android.R

@Composable
fun AccountRecoveryColumn(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.account_recovery),
            style = TextStyle(
                color = Color(0xFF1C1939),
                fontSize = 13.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
        Text(
            text = stringResource(R.string.link_profile),
            style = TextStyle(
                color = Color(0xFF60D3AA),
                fontSize = 13.sp,
                fontWeight = FontWeight.W400,
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}