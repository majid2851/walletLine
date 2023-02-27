package com.walletline.android.android.presentation.wallet.verify_number.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalTextInputService
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.mobile_number.mn_font_digit_num
import com.walletline.android.android.presentation.wallet.theme.Black
import com.walletline.android.android.presentation.wallet.theme.Green

@Composable
//@Preview
fun DigitCodes()
{

    val codesList by remember {
        mutableStateOf(mutableStateListOf<String>())
    }
    val stateColor by remember {
        mutableStateOf(mutableStateListOf<Color>())
    }

    codesList.add("")
    codesList.add("")
    codesList.add("")
    codesList.add("")

    stateColor.add(Black)
    stateColor.add(Black)
    stateColor.add(Black)
    stateColor.add(Black)

    LazyRow(modifier=Modifier.
        padding(top = dimensionResource(id = R.dimen.paddingVeryLarge)))
    {
        itemsIndexed(codesList)
        {index,item->

            Column(modifier=Modifier.
                width(dimensionResource(id = R.dimen.digit_below_width))
                , horizontalAlignment = Alignment.CenterHorizontally

            )
            {
                val focusRequester = remember { FocusRequester() }
                val inputService = LocalTextInputService.current
                val focus = remember { mutableStateOf(false) }

                BasicTextField(value = codesList.get(index),
                    onValueChange ={
                        if (it.length==1)
                        {
                            codesList.set(index,it)
                            stateColor.set(index, Green)
                        }else
                        {
                            codesList.set(index,"")
                            stateColor.set(index, Black)
                        }

                    },
                    modifier= Modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged {
                            if (focus.value != it.isFocused) {
                                focus.value = it.isFocused
                                if (!it.isFocused) {
                                    inputService?.hideSoftwareKeyboard()
                                }
                            }
                        },

                    textStyle = TextStyle(fontSize = mn_font_digit_num,
                    fontWeight = FontWeight(700),
                    textAlign = TextAlign.Center,
                    color = stateColor.get(index)

                    )
                )
                Box(modifier = Modifier
                    .width(dimensionResource(id = R.dimen.digit_below_line))
                    .height(dimensionResource(id = R.dimen.digit_below_line_height))
                    .background(color = stateColor.get(index))
                )
                {

                }
            }



        }
    }









}