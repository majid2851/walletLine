package com.walletline.android.presentation.screens.splash.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.walletline.android.R
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.padding

@Composable
fun SplashFooter(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.created_by),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = Modifier
                .width(MaterialTheme.padding.extraSmall)
        )
        Icon(
            tint = Color.Unspecified,
            modifier = Modifier
                .size(Dimen.HeartIconSize),
            painter = painterResource(id = R.drawable.ic_heart),
            contentDescription = stringResource(R.string.desc_heart_icon)
        )
    }
}