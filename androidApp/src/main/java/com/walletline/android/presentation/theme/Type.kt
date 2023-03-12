package com.walletline.android.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.walletline.android.R
import com.walletline.android.presentation.util.ssp

val dmSans = FontFamily(
    Font(R.font.dm_sans_bold, weight = FontWeight.Bold),
    Font(R.font.dm_sans_regular, weight = FontWeight.Normal),
)

@Composable
fun typography(): Typography =
     Typography(
        titleLarge = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Bold,
            fontSize = 35.ssp,
            lineHeight = 45.ssp,
        ),
        titleMedium = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Bold,
            fontSize = 25.ssp,
            lineHeight = 31.ssp,
        ),
        titleSmall = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Normal,
            fontSize = 24.ssp,
            lineHeight = 31.ssp,
        ),
         bodyLarge = TextStyle(
             fontFamily = dmSans,
             fontWeight = FontWeight.Bold,
             fontSize = 17.ssp,
             lineHeight = 25.ssp
         ),
        bodyMedium = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Medium,
            fontSize = 15.ssp,
            lineHeight = 25.ssp,
        ),
        bodySmall = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Bold,
            fontSize = 13.ssp,
            lineHeight = 20.ssp,
        ),
        labelSmall = TextStyle(
            fontFamily = dmSans,
            fontWeight = FontWeight.Medium,
            fontSize = 12.ssp,
            lineHeight = 16.ssp,
        )
    )



