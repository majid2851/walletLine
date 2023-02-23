package com.walletline.android.majid.ui.entrance_pattern.component

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.theme.Black
import com.walletline.android.android.presentation.wallet.theme.Gray_D9
import com.walletline.android.android.presentation.wallet.theme.Green3
import com.walletline.android.majid.ui.entrance_pattern.pattern_model.ComposeLockCallback
import com.walletline.android.majid.ui.entrance_pattern.pattern_model.Dot

@Preview
@Composable
fun PasswordPattern(context: Context= LocalContext.current)
{
    Box(modifier=Modifier
        .height(dimensionResource(id = R.dimen.pass_pattern_height))
    )
    {
        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize()
            ,
            dimension = 3,
            sensitivity = 80f,
            dotsDefaultColor = Gray_D9,
            dotsSecondColor=Gray_D9,
            dotsSize = 80f,
            linesColor = Green3,
            linesStroke = 10f,
            animationDuration = 200,
            animationDelay = 100,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot)
                {

                }

                override fun onDotConnected(dot: Dot)
                {

                }

                override fun onResult(result: List<Dot>)
                {
                    var connectedDots = ""
                    for (dot in result) connectedDots += "${dot.id }  "

                }
            }
        )

        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize(),
            dimension = 3,
            sensitivity = 80f,
            dotsDefaultColor = Gray_D9,
            dotsSecondColor = Green3,
            dotsSize = 55f,
            linesColor = Green3,
            linesStroke = 10f,
            animationDuration = 0,
            animationDelay = 100,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot)
                {

                }

                override fun onDotConnected(dot: Dot)
                {

                }

                override fun onResult(result: List<Dot>)
                {
                    var connectedDots = ""
                    for (dot in result) connectedDots += "${dot.id }  "

                }
            }
        )


    }














//    LazyVerticalGrid(
//        columns = GridCells.
//        Adaptive(dimensionResource(id = R.dimen.pass_pattern_width)),
//    )
//    {
//        items(9)
//        {
//            Box(modifier = Modifier
//                .padding(dimensionResource(id =
//                    R.dimen.circle_big_pattern_padding))
//                .width(dimensionResource(id = R.dimen.circle_big_pattern))
//                .height(dimensionResource(id = R.dimen.circle_big_pattern))
//                .background(shape = CircleShape, color = Gray_D9)
//
//            )
//            {
//                Box(modifier = Modifier
//                    .width(dimensionResource(id = R.dimen.circle_small_pattern))
//                    .height(dimensionResource(id = R.dimen.circle_small_pattern))
//                    .background(shape = CircleShape, color = Green3)
//                    .align(Alignment.Center)
//                )
//
//
//
//
//            }
//        }
//    }






}