package com.walletline.android.presentation.screens.auth.verify_number.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.sdp

@Composable
fun OtpTextField(
    otp: String,
    onOtpChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    borderWidth: Dp = 2.sdp,
    focusedBorderColor: Color = MaterialTheme.colorScheme.primary,
    unFocusedBorderColor: Color = MaterialTheme.colorScheme.onBackground
) {

    BasicTextField(
        modifier = modifier,
        value = otp,
        onValueChange = {
            onOtpChange(it.take(4))
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.padding.extraMedium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(4) { index ->
                val char = when {
                    index >= otp.length -> "0"
                    else -> otp[index].toString()
                }
                val isFocused = otp.length == index

                Box(
                    modifier = Modifier
                        .width(65.sdp)
                        .height(45.sdp)
                        .drawBehind {
                            val strokeWidth = borderWidth.value * density
                            val y = size.height - strokeWidth / 2

                            drawLine(
                                color = if (isFocused) focusedBorderColor else unFocusedBorderColor,
                                start = Offset(x = 0f, y = y),
                                end = Offset(x = size.width, y = y),
                                strokeWidth = strokeWidth
                            )
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = char,
                        style = MaterialTheme.typography.titleLarge,
                        color = if (isFocused) focusedBorderColor else unFocusedBorderColor,
                        textAlign = TextAlign.Center,
                    )
                }


            }
        }
    }

}

@Preview
@Composable
fun OtpTextFieldPreview() {
    var otp by remember {
        mutableStateOf("")
    }
    WalletLineTheme {
        WalletLineBackground {
            OtpTextField(
                modifier = Modifier
                    .align(Alignment.Center),
                otp = otp,
                onOtpChange = { otp = it }
            )
        }
    }
}