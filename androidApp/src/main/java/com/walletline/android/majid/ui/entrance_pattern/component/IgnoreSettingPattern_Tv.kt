package com.walletline.android.android.presentation.wallet.entrance_pattern.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.twoStyleText

@Preview
@Composable
fun IgnoreSettingPattern_Tv()
{
    Text(text = twoStyleText(
        text1 = stringResource(R.string.preferLessSccure),
        color1 = Black_1C,
        text2 = stringResource(R.string.ignoreSettingPattern),
        color2 = Green

    ))
}