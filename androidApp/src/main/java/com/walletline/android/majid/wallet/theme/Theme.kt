package com.codingwithmitch.food2forkcompose.presentation.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.codingwithmitch.kmm_learning_mitch.android.presentation.theme.*

private val LightThemeColors = lightColors(
  primary = Blue600,
  primaryVariant = Blue400,
  onPrimary = Black2,
  secondary = Color.White,
  secondaryVariant = Teal300,
  error = RedErrorDark,
  onError = RedErrorLight,
  background = Grey1,
  onBackground = Color.Black,
  surface = Color.White,
)
private val DarkColors= darkColors(

)

@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@Composable
fun AppTheme2(content: @Composable () -> Unit, )
{
  MaterialTheme(
    colors = LightThemeColors,
  ){
    Box(
      modifier = Modifier
        .fillMaxSize()
        .background(color = Background)
    ){
      content()

    }
  }
}





