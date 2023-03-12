package com.walletline.android.presentation.screens.auth.entrance_pattern

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.screens.auth.entrance_pattern.component.SensorRecognitionButton
import com.walletline.android.presentation.screens.auth.entrance_pattern.component.IgnoreSettingPatternSection
import com.walletline.android.presentation.screens.auth.components.AuthButton
import com.walletline.android.presentation.screens.auth.components.OrDivider
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.AuthTwoPartHeader
import com.walletline.android.presentation.screens.auth.entrance_pattern.component.pattern_model.PasswordPattern
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.sdp

@Composable
fun EntrancePatternContent(
    isSubmitEnabled: Boolean = false,
    onSubmitPatternClick: () -> Unit,
    onPatternResult: (String) -> Unit,
    onUseSensorClick: () -> Unit,
    onIgnoreSettingClick: () -> Unit
) {

    var isScrollEnabled by remember {
        mutableStateOf(true)
    }


    WalletLineBackground(
        isScrollEnabled = isScrollEnabled
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Spacer(modifier = Modifier.height(68.sdp))

            AuthTwoPartHeader(
                subHeaderText = stringResource(id = R.string.setYourOwn),
                mainHeaderFirstText = stringResource(id = R.string.entrance),
                mainHeaderSecondText = stringResource(id = R.string.pattern)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            PasswordPattern(
                onStart = {
                    isScrollEnabled = false
                },
                onResult = {
                    isScrollEnabled = true
                    onPatternResult(it)
                }
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            AuthButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                enabled = isSubmitEnabled,
                onClick = onSubmitPatternClick,
                text = stringResource(id = R.string.submitPattern),
                height = Dimen.DefaultButtonHeight
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            OrDivider(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            SensorRecognitionButton(
                modifier = Modifier
                    .padding(horizontal = 56.sdp),
                onClick = onIgnoreSettingClick

            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            IgnoreSettingPatternSection(
                modifier = Modifier
                    .padding(horizontal = 56.sdp),
                onIgnoreClick = onUseSensorClick
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

        }
    }
}


@Preview
@Composable
fun EntrancePatternPreview() {
    WalletLineTheme {

        EntrancePatternContent(
            onSubmitPatternClick = {},
            onPatternResult = {},
            onUseSensorClick = {},
            onIgnoreSettingClick = {}

        )

    }
}