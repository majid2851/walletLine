package com.walletline.android.majid.ui.mobile_number.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R


@Composable
fun SpinnerSample(
    list: List<MyData>,
    preselected: MyData,
    onSelectionChanged: (myData: MyData) -> Unit,
    modifier: Modifier = Modifier.
        width(dimensionResource(id = R.dimen.spinnerWidth))
) {

    var selected by remember { mutableStateOf(preselected) }
    var expanded by remember { mutableStateOf(false) } // initial value

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxHeight().clickable {
            expanded = !expanded
        }
    ) {

        Text(
            text = selected.name,
            modifier = Modifier.align(Alignment.CenterVertically)
                .weight(1f)
                , textAlign = TextAlign.Center
//                    .padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Icon(Icons.Outlined.ArrowDropDown,
            null,// modifier = Modifier.padding(8.dp)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
                .align(Alignment.CenterVertically)

        ) {
            list.forEach { listEntry ->

                DropdownMenuItem(
                    onClick = {
                        selected = listEntry
                        expanded = false
                        onSelectionChanged(selected)
                    },
                    text = {
                        Text(
                            text = listEntry.name,
                            modifier = Modifier
                                //.wrapContentWidth()  //optional instad of fillMaxWidth
                                .fillMaxWidth()
                                .align(Alignment.Start)
                        )
                    },
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun SpinnerSample_Preview() {
    MaterialTheme {
        val myData = listOf(MyData(0, "Apples"),
            MyData(1, "Bananas"), MyData(2, "Kiwis"))

        SpinnerSample(
            myData,
            preselected = myData.first(),
            onSelectionChanged = { },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

data class MyData (
    val id: Int,
    val name: String
)