package com.walletline.android.presentation.screens.auth.entrance_pattern.component.pattern_model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.walletline.android.presentation.theme.Dimen


@Composable
fun PasswordPattern(
    onStart: (dot: Dot) -> Unit,
    onResult: (result: String) -> Unit
) {
    Box(
        modifier = Modifier
            .size(Dimen.PasswordPatternSize),
        contentAlignment = Alignment.Center
    ) {
        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize(),
            dimension = 3,
            sensitivity = 80f,
            dotsDefaultColor = MaterialTheme.colorScheme.surfaceVariant,
            dotsSecondColor = MaterialTheme.colorScheme.surfaceVariant,
            dotsSize = 69f,
            linesColor = MaterialTheme.colorScheme.secondaryContainer,
            linesStroke = 10f,
            animationDuration = 200,
            animationDelay = 100,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot)  = Unit
                override fun onDotConnected(dot: Dot)  = Unit
                override fun onResult(result: List<Dot>, dotIdAsPassword: String) = Unit
            }
        )

        ComposeLockMain(
            modifier = Modifier
                .fillMaxSize(),
            dimension = 3,
            sensitivity = 80f,
            dotsDefaultColor = MaterialTheme.colorScheme.surfaceVariant,
            dotsSecondColor = MaterialTheme.colorScheme.secondaryContainer,
            dotsSize = 42f,
            linesColor = MaterialTheme.colorScheme.secondaryContainer,
            linesStroke = 10f,
            animationDuration = 0,
            animationDelay = 100,
            callback = object : ComposeLockCallback {
                override fun onStart(dot: Dot) {
                    onStart(dot)
                }

                override fun onDotConnected(dot: Dot) {

                }

                override fun onResult(result: List<Dot>, dotIdAsPassword: String) {
                    onResult(dotIdAsPassword)
                }
            }
        )

    }
}