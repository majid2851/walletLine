package com.walletline.android.majid.ui.entrance_pattern.pattern_model

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.OVAL
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatImageView
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.res.dimensionResource
import androidx.core.animation.doOnEnd
import com.walletline.android.R

private const val ANIMATION_DURATION=200L
private const val ANIMATION_SCALE_VALUE=2f

private var animator:ObjectAnimator ?=null

class DowView @JvmOverloads constructor(
    context: Context,
    attrs:AttributeSet?=null,
    defStyleAttr:Int=0,

):AppCompatImageView(context,attrs,defStyleAttr)
{
    var key:String ?=null
    private set
    init {
        setImageDrawable(GradientDrawable().apply {
            layoutParams= LinearLayout.LayoutParams(
                    resources.getDimensionPixelSize(R.dimen.dot_view_size),
                    resources.getDimensionPixelSize(R.dimen.dot_view_size)
                )
            shape=OVAL
            setColor(Color.DKGRAY)
        })
        setWillNotDraw(false)
    }

    override fun onDetachedFromWindow()
    {
        super.onDetachedFromWindow()
        animator?.cancel()
        animator?.removeAllListeners()
        animator=null
    }
    fun setKey(key:String)
    {
        this.key=key
    }
//    fun setDotViewColor(
//        @ColorInt color:Color
//    )
//    {
//        (drawable as GradientDrawable).setColor(color)
//    }

    fun animateDotView()
    {
        animator=ObjectAnimator.ofPropertyValuesHolder(
            this
            ,PropertyValuesHolder.ofFloat("scaleX", ANIMATION_SCALE_VALUE)
            ,PropertyValuesHolder.ofFloat("scaleY", ANIMATION_SCALE_VALUE)

            ).apply()
            {
                duration= ANIMATION_DURATION
                repeatMode=ValueAnimator.RESTART
                start()

            }
        animator?.doOnEnd()
        {
            animator?.removeAllListeners()
            animator=null

        }

    }


}














