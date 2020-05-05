package com.lockwood.robotospandemo.span

import android.text.TextPaint
import android.text.style.MetricAffectingSpan

class AlignTopSuperscriptSpan : MetricAffectingSpan() {

    companion object {

        private const val DEFAULT_SHIFT_SCALE = 1.25
    }

    private val TextPaint.superscriptShift: Int
        get() = (ascent() / DEFAULT_SHIFT_SCALE).toInt()

    override fun updateDrawState(tp: TextPaint) {
        tp.baselineShift += tp.superscriptShift
    }

    override fun updateMeasureState(tp: TextPaint) {
        tp.baselineShift += tp.superscriptShift
    }

}
