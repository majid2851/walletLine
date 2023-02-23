package com.walletline.android.android.presentation.wallet.social_register.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.walletline.android.R
import com.walletline.android.android.presentation.wallet.theme.Black
import com.walletline.android.android.presentation.wallet.theme.Black_29

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
            .width(dimensionResource(id = R.dimen.socialRegisterSignHeight))
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