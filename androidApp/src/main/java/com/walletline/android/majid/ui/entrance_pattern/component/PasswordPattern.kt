package com.walletline.android.majid.ui.entrance_pattern.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Gray_D9
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Green3
import com.walletline.android.R

@Preview
@Composable
fun PasswordPattern()
{
    LazyVerticalGrid(
        columns = GridCells.
        Adaptive(dimensionResource(id = R.dimen.pass_pattern_width)),
//        modifier = Modifier.weight(1f),
    )
    {
        items(9)
        {
            Box(modifier = Modifier
                .padding(dimensionResource(id =
                    R.dimen.circle_big_pattern_padding))
                .width(dimensionResource(id = R.dimen.circle_big_pattern))
                .height(dimensionResource(id = R.dimen.circle_big_pattern))
                .background(shape = CircleShape, color = Gray_D9)

            )
            {
                Box(modifier = Modifier
                    .width(dimensionResource(id = R.dimen.circle_small_pattern))
                    .height(dimensionResource(id = R.dimen.circle_small_pattern))
                    .background(shape = CircleShape, color = Green3)
                    .align(Alignment.Center)
                )




            }
        }
    }






}