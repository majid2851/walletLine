package com.walletline.android.presentation.theme.transition

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.core.tween
import com.ramcosta.composedestinations.animations.defaults.RootNavGraphDefaultAnimations

object WalletLineTransitionAnimation {
    val default = RootNavGraphDefaultAnimations(
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentScope.SlideDirection.Left,
                animationSpec = tween(
                    durationMillis = TransitionDurations.MEDIUM,
                    delayMillis = TransitionDurations.MEDIUM
                )
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentScope.SlideDirection.Left,
                animationSpec = tween(
                    durationMillis = TransitionDurations.MEDIUM,
                    delayMillis = TransitionDurations.MEDIUM
                )
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentScope.SlideDirection.Right,
                animationSpec = tween(
                    durationMillis = TransitionDurations.MEDIUM,
                    delayMillis = TransitionDurations.MEDIUM
                )
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentScope.SlideDirection.Right,
                animationSpec = tween(
                    durationMillis = TransitionDurations.MEDIUM,
                    delayMillis = TransitionDurations.MEDIUM
                )
            )
        }
    )
}