package com.walletline.android.majid.ui.register_finished

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.walletline.android.R
import com.walletline.android.majid.ui.register_finished.component.AccountCreatedRow
import com.walletline.android.majid.ui.register_finished.component.AccountRecoveryColumn
import com.walletline.android.majid.ui.register_finished.component.StartFunButton

@Composable
@Preview
fun RegistrationFinished() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFFFFFF))
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.End)
//                    .offset(x= 70.dp, y= (-175).dp)
                .size(
                    width = dimensionResource(id = R.dimen.registrationBgImageWidth),
                    height = dimensionResource(id = R.dimen.registrationBgImageHeight)
                ),
            painter = painterResource(id = R.drawable.registration_bg),
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.spacerHeight22)))
        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(
                    width = dimensionResource(id = R.dimen.registrationDolphinImageWidth),
                    height = dimensionResource(id = R.dimen.registrationDolphinImageHeight)
                ),
            painter = painterResource(id = R.drawable.registration_dolphin),
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.spacerHeight61)))
        AccountCreatedRow()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.spacerHeight42)))
        Text(
            text = stringResource(R.string.account_created_message),
            style = TextStyle(
                color = Color(0xFF1C1939),
                fontSize = 15.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                    start = dimensionResource(id = R.dimen.textPadding30),
                    end = dimensionResource(id = R.dimen.textPadding30)
                ),
        )
        Spacer(modifier = Modifier.weight(1f))
        StartFunButton()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.spacerHeight19)))
        AccountRecoveryColumn()
        Spacer(modifier = Modifier.size(dimensionResource(id = R.dimen.spacerHeight93)))
    }
}


