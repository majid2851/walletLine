package com.walletline.android.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.walletline.android.R

val dmSans = FontFamily(
    Font(R.font.dm_sans_bold, weight = FontWeight.Bold),
    Font(R.font.dm_sans_regular, weight = FontWeight.Normal),
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
        lineHeight = 45.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        lineHeight = 31.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 31.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 25.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Bold,
        fontSize = 13.sp,
        lineHeight = 20.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = dmSans,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
    )
)