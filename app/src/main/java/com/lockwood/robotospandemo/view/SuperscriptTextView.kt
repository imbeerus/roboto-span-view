package com.lockwood.robotospandemo.view

import android.annotation.SuppressLint
import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.util.AttributeSet
import com.lockwood.multispan.roboto.RobotoTwoSpanView
import com.lockwood.robotospandemo.span.AlignTopSuperscriptSpan

@SuppressLint("Recycle")
class SuperscriptTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RobotoTwoSpanView(context, attrs) {

    override fun setSpanOnResult(resultSpans: SpannableString): CharSequence {
        return if (secondText.isNotEmpty()) {
            val start = resultSpans.length - secondText.length
            val end = resultSpans.length
            resultSpans.setSpan(
                AlignTopSuperscriptSpan(),
                start,
                end,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            resultSpans
        } else {
            super.setSpanOnResult(resultSpans)
        }
    }

}