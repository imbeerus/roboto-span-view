package com.lockwood.multispan.roboto.extensions

import android.content.res.ColorStateList
import androidx.annotation.ColorInt

internal fun colorToStateList(@ColorInt color: Int): ColorStateList {
    return ColorStateList.valueOf(color)
}