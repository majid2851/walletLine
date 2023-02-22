package com.walletline.android.majid.ui.social_register.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.walletline.android.R

@Composable
fun StartFunButton() {
    Button(
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.buttonCornerRadius10)),
        modifier = Modifier
            .padding(
                start = dimensionResource(id = R.dimen.buttonPadding27),
                end = dimensionResource(id = R.dimen.buttonPadding27),
              /*  top = dimensionResource(id = R.dimen.buttonPadding15),
                bottom = dimensionResource(id = R.dimen.buttonPadding18)*/
            )
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.buttonHeight55)),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9201)),
        onClick = {}) {
        Text(
            text = stringResource(R.string.start_fun),
            style = TextStyle(
                color = Color(0xFFFFFFFF),
                fontSize = 17.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Center,
            ),

            )
    }
}