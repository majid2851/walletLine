package com.walletline.android.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.theme.Black
import com.walletline.android.android.presentation.wallet.theme.Gray_B0
import com.walletline.android.android.presentation.wallet.theme.Green2
import com.walletline.android.android.presentation.wallet.theme.White_Pale
import com.walletline.android.majid.constants.Utils
import com.walletline.android.majid.ui.mobile_number.component.MyData
import com.walletline.android.majid.ui.mobile_number.component.SpinnerSample

@Preview
@Composable
fun PhoneField()
{
    var phoneNumber by remember {
        mutableStateOf("")
    }
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
        val list=ArrayList<MyData>()
        list.add(MyData(1,"NL +31"))
        list.add(MyData(1,"IR +98"))
        list.add(MyData(1,"USA +001"))

        SpinnerSample(list = list
            , preselected =list.get(0)
            , onSelectionChanged ={}
        )



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
            modifier= Modifier
                .align(Alignment.CenterVertically)
                .fillMaxHeight()
        )
        {
            TextField(
                value = phoneNumber,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done,

                ),
                label ={ Text(
                    text=stringResource(R.string.phoneNumberHint)
                )},
                onValueChange = {
                    if(it.length<= Utils.PHONE_LENGTH)
                        phoneNumber=it }
                ,modifier= Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center),
//                placeholder = { Text(
//                    text=stringResource(R.string.phoneNumberHint)
//                )
//                },

                colors = TextFieldDefaults.textFieldColors(
                    textColor = Black,
                    disabledTextColor = Color.Transparent,
//                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    containerColor=White_Pale
                ),
            )
        }




    }











}