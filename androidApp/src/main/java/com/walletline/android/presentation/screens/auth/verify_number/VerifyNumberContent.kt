package com.walletline.android.presentation.screens.auth.verify_number

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.screens.auth.components.AuthBodyText
import com.walletline.android.presentation.screens.auth.components.AuthButton
import com.walletline.android.presentation.screens.auth.components.AuthHeader
import com.walletline.android.presentation.util.underlineText
import com.walletline.android.presentation.screens.auth.verify_number.component.OtpTextField
import com.walletline.android.presentation.screens.auth.verify_number.component.ResendCodeSection
import com.walletline.android.presentation.screens.auth.verify_number.component.TermsAndConditionsSection
import com.walletline.android.presentation.screens.auth.verify_number.component.WrongNumberSection
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding

@Composable
fun VerifyNumberContent(
    otp: String,
    phoneNumber: String = "+98 00 000 000 00.",
    isProceedEnabled: Boolean = false,
    onOtpChange: (String) -> Unit,
    onChangeNumberClick: () -> Unit,
    onResendCodeClick: () -> Unit,
    onProceedButtonClick: () -> Unit,
    onTermsClicked: () -> Unit
) {

    // For test purposes only
    var isVisible by remember {
        mutableStateOf(false)
    }
    WalletLineBackground {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(Dimen.VerifyNumberTopMargin))


            AuthHeader(
                firstWord = stringResource(id = R.string.verify),
                secondWord = stringResource(id = R.string.number),
                thirdWord = stringResource(id = R.string.exclamation_mark)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.small))

            AuthBodyText(text = stringResource(R.string.enter4DigitDesc))

            Spacer(modifier = Modifier.height(MaterialTheme.padding.small))

            Text(
                text = underlineText(
                    text = phoneNumber,
                    color = MaterialTheme.colorScheme.primary,
                ),
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.small))

            WrongNumberSection(
                isVisible = isVisible,
                onChangeClick = onChangeNumberClick
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            OtpTextField(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                otp = otp,
                onOtpChange = onOtpChange
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            ResendCodeSection(
                isVisible = isVisible,
                onResendClick = onResendCodeClick
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.large))

            AuthButton(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                onClick = onProceedButtonClick,
                enabled = isProceedEnabled,
                text = stringResource(id = R.string.proceed),
                height = Dimen.DefaultButtonHeight
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

            TermsAndConditionsSection(
                modifier = Modifier
                    .padding(horizontal = MaterialTheme.padding.smallLarge),
                onTermsClicked = {
                    isVisible = !isVisible
                    onTermsClicked()
                }
            )

            Spacer(modifier = Modifier.height(MaterialTheme.padding.medium))

        }
    }
}

@Preview
@Composable
fun VerifyNumberContentPreview() {
    var otp by remember {
        mutableStateOf("")
    }
    WalletLineTheme {
        WalletLineBackground {
            VerifyNumberContent(
                otp = otp,
                onOtpChange = {
                    otp = it
                },
                onChangeNumberClick = {},
                onResendCodeClick = {},
                onProceedButtonClick = {},
                onTermsClicked = {},
            )
        }
    }
}