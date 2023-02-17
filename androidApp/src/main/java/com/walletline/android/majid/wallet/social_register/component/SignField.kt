package com.codingwithmitch.kmm_wms.android.presentation.wallet.social_register.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_1C
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_29
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.White
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun SignField(icon:Int=0,title:String="")
{
    Row(verticalAlignment = Alignment.CenterVertically
        , modifier= Modifier
            .fillMaxWidth()
            .padding(top = dimensionResource(id = R.dimen.paddingLayouts10))
            .background(
                color = Color.Transparent,
                shape =
                RoundedCornerShape(dimensionResource(id = R.dimen.signFieldBorder))
            )
            .height(dimensionResource(id = R.dimen.socialRegisterSignHeight))
            .border(
                width = dimensionResource(id = R.dimen.border),
                color = Black,
                shape = RoundedCornerShape(
                    dimensionResource(id = R.dimen.phoneFieldCorner),
                )
            )
     )
    {
        Image(painter =
            painterResource(id = icon)
            , contentDescription =""
            ,modifier=Modifier.
            width(dimensionResource(id = R.dimen.signFieldIconWidth))

        )


        Text(text = title,

            modifier= Modifier
                .fillMaxWidth()
                .padding(
                    end =
                    dimensionResource(id = R.dimen.signFieldIconWidth)
                ), fontWeight = FontWeight(700)
                , textAlign = TextAlign.Center,
                color = Black_29
            )




    }







}