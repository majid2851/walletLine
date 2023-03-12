package com.walletline.android.presentation.screens.auth.entrance_pattern.component.pattern_model

import android.util.Log
import android.util.Range
import android.view.MotionEvent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


const val ArrowSizeBigger: Float = 1.5f
const val ArrowStroke: Float = 6.0f
const val ArrowSize: Float = 24f

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ComposeLockMain(
    modifier: Modifier,
    dimension: Int,
    sensitivity: Float,
    dotsDefaultColor: Color,
    dotsSecondColor: Color,
    dotsSize: Float,
    linesColor: Color,
    linesStroke: Float,
    animationDuration: Int = 200,
    animationDelay: Long = 100,
    callback: ComposeLockCallback
) {
    val scope = rememberCoroutineScope()
    val dotsList = remember {
        mutableListOf<Dot>()
    }


    val previewLine = remember {
        mutableStateOf(Line(Offset(0f, 0f), Offset(0f, 0f)))
    }
    val connectedLines = remember {
        mutableListOf<Line>()
    }
    val connectedDots = remember {
        mutableListOf<Dot>()
    }
    Canvas(
        modifier
            .pointerInteropFilter { motionEvent ->
                when (motionEvent.action) {

                    MotionEvent.ACTION_DOWN -> {

                        refreshThis(connectedLines, connectedDots, dotsList, dotsDefaultColor)


                        for (dots in dotsList) {

                            if (
                                motionEvent.x in Range(
                                    dots.offset.x - sensitivity,
                                    dots.offset.x + sensitivity
                                ) &&
                                motionEvent.y in Range(
                                    dots.offset.y - sensitivity,
                                    dots.offset.y + sensitivity
                                )
                            ) {

                                connectedDots.add(dots)
                                callback.onStart(dots)
                                scope.launch {
                                    dots.size.animateTo(
                                        (dotsSize * 1.2).toFloat(),
                                        tween(animationDuration)
                                    )
                                    dots.color = dotsSecondColor
                                    delay(animationDelay)
                                    dots.size.animateTo(dotsSize, tween(animationDuration))
                                }
                                previewLine.value =
                                    previewLine.value.copy(
                                        start = Offset(
                                            dots.offset.x,
                                            dots.offset.y
                                        )
                                    )


                            }
                        }

                    }
                    MotionEvent.ACTION_MOVE -> {
                        previewLine.value = previewLine.value.copy(end = Offset(motionEvent.x, motionEvent.y))
                        for (dots in dotsList) {
                            if (!connectedDots.contains(dots)) {
                                if (
                                    motionEvent.x in Range(

                                        dots.offset.x - sensitivity,
                                        dots.offset.x + sensitivity
                                    ) &&
                                    motionEvent.y in Range(
                                        dots.offset.y - sensitivity,
                                        dots.offset.y + sensitivity
                                    )
                                ) {

                                    connectedLines.add(
                                        Line(
                                            start = previewLine.value.start,
                                            end = dots.offset
                                        )
                                    )

                                    connectedDots.add(dots)
                                    callback.onDotConnected(dots)
                                    scope.launch {
                                        dots.size.animateTo(
                                            (dotsSize * 1.2).toFloat(),
                                            tween(animationDuration)
                                        )
                                        dots.color = dotsSecondColor
                                        delay(animationDelay)
                                        dots.size.animateTo(dotsSize, tween(animationDuration))
                                    }
                                    previewLine.value = previewLine.value.copy(start = dots.offset)


                                }
                            }
                        }
                    }
                    MotionEvent.ACTION_UP -> {
                        previewLine.value =
                            previewLine.value.copy(start = Offset(0f, 0f), end = Offset(0f, 0f))
                        callback.onResult(
                            connectedDots,
                            dotIdAsPassword = connectedDots.map { dot -> dot.id }
                                .joinToString(separator = "")
                        )

                    }
                }
                true
            }) {
        val realDimension = dimension + 1
        val mSize = size
        val spaceBetweenWidthDots = (mSize.width / (dimension - 1)) - sensitivity
        val spaceBetweenHeightDots = (mSize.height / (dimension - 1)) - sensitivity
        val dotsOnWidth = arrayOfNulls<Int>(realDimension * realDimension)
        val dotsOnHeight = arrayOfNulls<Int>(realDimension * realDimension)
        dotsOnWidth.forEachIndexed { WidthIndex, _ ->
            val readWidthIndex = WidthIndex + 1
            dotsOnHeight.forEachIndexed { HeightIndex, _ ->
                val readHeightIndex = HeightIndex + 1
                if (readWidthIndex < realDimension && readHeightIndex < realDimension) {
                    if (dotsList.count() < dimension * dimension) {
                        val dotOffset = Offset(
                            (spaceBetweenWidthDots * HeightIndex) + sensitivity,
                            (spaceBetweenHeightDots * WidthIndex) + sensitivity
                        )
                        dotsList.add(
                            Dot(
                                dotsList.size + 1,
                                dotOffset,
                                Animatable(dotsSize),
                                dotsDefaultColor
                            )
                        )
                    }
                }
            }
        }
        if (previewLine.value.start != Offset(0f, 0f) && previewLine.value.end != Offset(0f, 0f)) {


            drawLine(
                color = linesColor,
                start = previewLine.value.start,
                end = previewLine.value.end,
                strokeWidth = linesStroke,
                cap = StrokeCap.Round
            )
        }
        for (dots in dotsList) {
            drawCircle(
                color = dots.color,
                radius = dots.size.value,
                center = dots.offset
            )
        }
        for (line in connectedLines) {
            Log.i(
                "mag2851", line.start.x.toString() + ","
                        + line.start.y.toString()
            )
            if (line.start.x != 0f && line.start.y != 0f) {
                drawLine(
                    color = linesColor,
                    start = line.start,
                    end = line.end,
                    strokeWidth = linesStroke,
                    cap = StrokeCap.Round,

                    )


                //horizontal movement------------------------------------------
                drawLine(
                    color = dotsSecondColor//Color.Red
                    ,
                    start = (line.start + line.end) / 2f -
                            if (line.start.y == line.end.y) {
                                if (line.start.x < line.end.x) {
                                    Offset(ArrowSize, -ArrowSize)
                                } else Offset(-ArrowSize, ArrowSize)
                            } else Offset(0f, 0f),
                    end = (line.start + line.end) / 2f,
                    strokeWidth = ArrowStroke

                )
                drawLine(
                    color = dotsSecondColor//Color.Blue
                    ,
                    start = (line.start + line.end) / 2f -
                            if (line.start.y == line.end.y) {
                                if (line.start.x < line.end.x) {
                                    Offset(ArrowSize, ArrowSize)
                                } else Offset(-ArrowSize, -ArrowSize)
                            } else Offset(0f, 0f),
                    end = (line.start + line.end) / 2f,
                    strokeWidth = ArrowStroke
                )
                //vertical movement--------------------------------------------------------------------------------------
                drawLine(
                    color = dotsSecondColor//Color.Red
                    , start = (line.start + line.end) / 2f -
                            if (line.start.x == line.end.x) {
                                if (line.start.y < line.end.y) {
                                    Offset(-ArrowSize, ArrowSize)
                                } else Offset(ArrowSize, -ArrowSize)
                            } else {
                                Offset(0f, 0f)
                            }, end = (line.start + line.end) / 2f, strokeWidth = ArrowStroke

                )
                drawLine(
                    color = dotsSecondColor// Color.Blue
                    ,
                    start = (line.start + line.end) / 2f -
                            if (line.start.x == line.end.x) {
                                if (line.start.y < line.end.y) {
                                    Offset(ArrowSize, ArrowSize)
                                } else Offset(-ArrowSize, -ArrowSize)
                            } else Offset(0f, 0f),
                    end = (line.start + line.end) / 2f,
                    strokeWidth = ArrowStroke
                )


                //----------------------------------------------------
                //other movement =>
                drawLine(
                    color = dotsSecondColor,//Color.Red
                    start = (line.start + line.end) / 2f -
                            (
                                    if (line.start.x != line.end.x && line.start.y != line.end.y
                                        && line.start.x > line.end.x && line.end.y > line.start.y
                                    ) {
                                        Offset(-ArrowSize * ArrowSizeBigger, 0f)
                                    } else if (line.start.x != line.end.x && line.start.y != line.end.y
                                        && line.start.x < line.end.x && line.end.y < line.start.y
                                    ) {
                                        Offset(ArrowSize * ArrowSizeBigger, 0f)
                                    } else if (line.start.x != line.end.x && line.start.y != line.end.y) {
                                        if (line.start.y < line.end.y) {
                                            Offset(ArrowSize * ArrowSizeBigger, 0f)
                                        } else Offset(
                                            -ArrowSize * ArrowSizeBigger,
                                            0f
                                        )
                                    } else {
                                        Offset(0f, 0f)
                                    }


                                    ),
                    end = (line.start + line.end) / 2f,
                    strokeWidth = ArrowStroke,

                    )
                drawLine(
                    color = dotsSecondColor,//Color.Blue
                    start = (line.start + line.end) / 2f -
                            (
                                    if (line.start.x != line.end.x && line.start.y != line.end.y
                                        && line.start.x > line.end.x && line.end.y > line.start.y
                                    ) {
                                        Offset(0f, ArrowSize * ArrowSizeBigger)
                                    } else if (line.start.x != line.end.x && line.start.y != line.end.y
                                        && line.start.x < line.end.x && line.end.y < line.start.y
                                    ) {
                                        Offset(0f, -ArrowSize * ArrowSizeBigger)
                                    } else if (line.start.x != line.end.x && line.start.y != line.end.y) {
                                        if (line.start.y < line.end.y) {
                                            Offset(0f, ArrowSize * ArrowSizeBigger)
                                        } else Offset(
                                            0f,
                                            -ArrowSize * ArrowSizeBigger
                                        )
                                    } else {
                                        Offset(0f, 0f)
                                    }),
                    end = (line.start + line.end) / 2f,
                    strokeWidth = ArrowStroke,

                    )


                //----------------------------------------------------


            }


        }

    }
}

private fun refreshThis(
    connectedLines: MutableList<Line>,
    connectedDots: MutableList<Dot>,
    dotsList: MutableList<Dot>,
    dotsDefaultColor: Color
) {
    connectedLines.clear()
    connectedDots.clear()
    for (dot in dotsList) {
        dot.color = dotsDefaultColor
    }
}

@Preview
@Composable
fun ComposeLockPreview() {
    ComposeLockMain(
        Modifier
            .width(500.dp)
            .height(1000.dp)
            .background(Color.White),
        2,
        100f,
        dotsDefaultColor = Color.Black,
        dotsSecondColor = Color.Green,
        20f,
        Color.Black,
        30f,
        200,
        100,
        object : ComposeLockCallback {

            override fun onStart(dot: Dot) {

            }

            override fun onDotConnected(dot: Dot) {

            }

            override fun onResult(result: List<Dot>, dotIdAsPassword: String) {

            }
        }
    )
}