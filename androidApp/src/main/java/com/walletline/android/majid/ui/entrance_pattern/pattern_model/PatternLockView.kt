package com.walletline.android.majid.ui.entrance_pattern.pattern_model

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.CountDownTimer
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import com.walletline.android.R

class PatternLockView @JvmOverloads constructor(context: Context,
                             attrs: AttributeSet?=null,
                             defStyleAttr:Int=0
): LinearLayout(context,attrs, defStyleAttr)
{
    var stateStage:PatternViewStageState=PatternViewStageState.FIRST
    private var touchPointX:Float=0.0f
    private var touchPointY:Float=0.0f
    private val minCount=4
    private val maxCount=9
    private val marketDotList= mutableListOf<Dot>()
    private var initialDotList= mutableListOf<Dot>()
    private var state:PatternViewState=PatternViewState.Initial
    private var attrIsDotAnimated=true
    private var onChangeStateListener:((state:PatternViewState)->Unit)?=null
    private var countDownTimer:CountDownTimer?=null
    private var stagePassword= linkedMapOf<PatternViewStageState,String>()

    @ColorInt
    private var attrDotColor= Color.DKGRAY

    @ColorInt
    private var attrLineColor= Color.DKGRAY

    @ColorInt
    private var attrErrorDotColor= Color.RED

    @ColorInt
    private var attrErrorLineColor= Color.RED


    @ColorInt
    private var attrSuccessDotColor= Color.BLUE

    @ColorInt
    private var attrSuccessLineColor= Color.BLUE

    private var rect= Rect()

    private val dotNumberKeyArray= arrayOf(
        arrayOf("1","2","3"),
        arrayOf("4","5","6"),
        arrayOf("7","8","9")
    )
    /*
    * */
    private val paint=Paint(Paint.ANTI_ALIAS_FLAG).apply{
        style=Paint.Style.FILL
        strokeWidth=12f
        color=Color.DKGRAY

    }
    init {
        context.theme.obtainStyledAttributes(
            attrs, R.styleable.PatternLockView,0,0
        ).apply {
            try {
                attrIsDotAnimated=
                    getBoolean(R.styleable.PatternLockView_patternLock_isAnimated,true)
                attrDotColor=
                    getColor(R.styleable.PatternLockView_patternLock_dotColor,Color.DKGRAY)
                attrLineColor=
                    getColor(R.styleable.PatternLockView_patternLock_lineColor,Color.DKGRAY)
                attrSuccessDotColor=
                    getColor(R.styleable.PatternLockView_patternLock_successDotColor,Color.DKGRAY)
                attrSuccessLineColor=
                    getColor(R.styleable.PatternLockView_patternLock_successLineColor,Color.DKGRAY)
                attrErrorDotColor=
                    getColor(R.styleable.PatternLockView_patternLock_errorDotColor,Color.DKGRAY)
                attrErrorLineColor=
                    getColor(R.styleable.PatternLockView_patternLock_errorLineColor,Color.DKGRAY)

            }finally {
              recycle()
            }
        }

        orientation=VERTICAL
        paint.color=attrErrorLineColor
        drawPatternView()
        setWillNotDraw(false)

    }

    override fun onDraw(canvas: Canvas?)
    {
        super.onDraw(canvas)
        addInitialDraw(canvas)
        if(state is PatternViewState.Error)
        {
            updateViewState(state)
        }
        drawLine(canvas)
        if(state is PatternViewState.Error)
        {
            countDownTimer=object :CountDownTimer(1000,1000)
            {

            }
        }

    }

    private fun drawLine(canvas: Canvas?)
    {


    }

    private fun addInitialDraw(canvas: Canvas?) {


    }

    private fun updateViewState(state: PatternViewState.Error)
    {


    }

    private fun drawPatternView()
    {


    }


}

