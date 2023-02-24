package com.walletline.android.majid.ui.entrance_pattern.pattern_model

import androidx.annotation.ColorInt

sealed class PatternViewState
{
    data class Success(
        @ColorInt val dotColor:Int,
        @ColorInt val lineColor:Int
    ):PatternViewState()

    data class Error(
        @ColorInt val dotColor: Int,
        @ColorInt val lineColor: Int,
    ):PatternViewState()
    object Initial:PatternViewState()
    object Started:PatternViewState()









}