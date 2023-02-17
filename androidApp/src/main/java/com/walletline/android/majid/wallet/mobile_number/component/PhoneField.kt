package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Gray_B0
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green2
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.White_Pale
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_country_code

@Preview
@Composable
fun PhoneField()
{
    Row(modifier= Modifier
        .fillMaxWidth()
        .padding(
            top = dimensionResource(id = R.dimen.paddingLayouts10),
            bottom = dimensionResource(id = R.dimen.paddingLayouts10)
        )
        .height(dimensionResource(id = R.dimen.heightPhoneField))
        .background(
            color = White_Pale,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.phoneFieldCorner),
            )
        )
        .border(
            width = dimensionResource(id = R.dimen.border),
            color = Green2,
            shape = RoundedCornerShape(
                dimensionResource(id = R.dimen.phoneFieldCorner),
            )
        )


    )
    {

        Spacer(modifier=Modifier.width(dimensionResource(id = R.dimen.paddingLayouts10)))

        Text(text = stringResource(R.string.countryCode),
            color = Black,
            fontSize = mn_font_country_code,
            fontWeight = FontWeight(500),
            modifier=Modifier.align(Alignment.CenterVertically)
        )
        Spacer(modifier=Modifier.width(dimensionResource(id = R.dimen.paddingLayouts4)))

        Image(painter = painterResource(id = R.drawable.ic_below_errow)
            , contentDescription = "",
            modifier=Modifier.align(Alignment.CenterVertically))

        Spacer(modifier=Modifier.width(dimensionResource(id = R.dimen.paddingLayouts4)))

        Box(modifier= Modifier
            .width(dimensionResource(id = R.dimen.line_width_1))
            .height(dimensionResource(id = R.dimen.line_PhoneField_height))
            .background(
                color = Gray_B0, shape =
                RoundedCornerShape(dimensionResource(id = R.dimen.line_PhoneField_Corner))
            )
            .align(Alignment.CenterVertically)
        )
        {

        }

        Box(
            modifier=Modifier.align(Alignment.CenterVertically)
                .fillMaxHeight()
        )
        {
            TextField(value = "",
                onValueChange = {},modifier= Modifier
                    .fillMaxWidth()
                    .fillMaxHeight().align(Alignment.Center),
                placeholder = { Text(
                    text=stringResource(R.string.phoneNumberHint),
                )},

                colors = TextFieldDefaults.textFieldColors(
                    textColor = Gray_B0,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                ),
            )
        }




    }











}