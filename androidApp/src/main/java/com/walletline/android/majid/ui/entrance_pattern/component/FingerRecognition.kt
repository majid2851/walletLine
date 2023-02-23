package com.walletline.android.android.presentation.wallet.entrance_pattern.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_use_my_fingerprint
import com.walletline.android.android.presentation.wallet.theme.Black
import com.walletline.android.android.presentation.wallet.theme.Black_1C

@Preview
@Composable
fun FingerRecognition()
{
    Row(modifier= Modifier
        .width(dimensionResource(id = R.dimen.fingerRecognitionRowWidth))
        .height(dimensionResource(id = R.dimen.fingerRecognitionRowHeight))
        .border(
            width = dimensionResource(id = R.dimen.border),
            color = Black,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.phoneFieldCorner),
            )
        )
        , verticalAlignment = Alignment.CenterVertically
    )
    {
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts7))
        )
        Image(painter =
        painterResource(id = R.drawable.ic___icon__finger_scan_)
            , contentDescription = ""
            ,modifier=Modifier.size(dimensionResource(id = R.dimen.fingerScanImgSize))

        )
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts10))
        )
        Text(
            text = stringResource(R.string.useMyFinger),
            color = Black_1C,
            fontWeight = FontWeight(700),
            fontSize = mn_font_use_my_fingerprint

        )
        Spacer(modifier = Modifier
            .width(dimensionResource(id = R.dimen.paddingLayouts7))
        )

    }









}