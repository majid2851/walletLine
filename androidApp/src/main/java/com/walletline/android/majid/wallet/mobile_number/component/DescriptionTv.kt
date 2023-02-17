package com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.Black_CC
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.wallet.mobile_number.mn_font_desc

@Preview
@Composable
fun DescriptionTv(desc:String="")
{
    Text(text = desc,
        fontWeight = FontWeight(400),
        color = Black_CC,
        fontSize = mn_font_desc,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = dimensionResource(id  = R.dimen.paddingTopDesc),
                start = dimensionResource (id = R.dimen.paddingDesc),
                end = dimensionResource (id = R.dimen.paddingDesc),
            )
    )



    
}
