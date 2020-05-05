/*
 * Copyright (C) 2020  Ivan Zinovyev (https://github.com/lndmflngs)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lockwood.multispan.roboto.base

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import com.lockwood.multispan.MultiSpanView
import com.lockwood.multispan.roboto.R
import com.lockwood.multispan.roboto.delegate.SpanFontDelegate
import com.lockwood.multispan.roboto.delegate.SpanStyleDelegate
import com.lockwood.multispan.roboto.item.RobotoSpanItem
import com.lockwood.multispan.roboto.spannable.RobotoSpannable

abstract class RobotoMultiSpanView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : MultiSpanView<RobotoSpanItem>(context, attrs, defStyleAttr), RobotoSpannable {

    companion object {

        private const val REGULAR_ROBOTO_FONT = 0
    }

    //region Fields
    private val robotoFontFamilies = resources.getStringArray(R.array.roboto_font_families)

    private val robotoStyles = resources.getIntArray(R.array.roboto_styles)
    // endregion

    override fun initSpan(): RobotoSpanItem {
        return RobotoSpanItem(
            textSize = textSize.toInt(),
            textColor = currentTextColor
        )
    }

    //region TypedArray extensions
    protected fun TypedArray.getRobotoFontFamily(index: Int): String {
        val position = getInt(index, REGULAR_ROBOTO_FONT)
        return try {
            robotoFontFamilies[position]
        } catch (e: Exception) {
            robotoFontFamilies[REGULAR_ROBOTO_FONT]
        }
    }

    protected fun TypedArray.getRobotoFontStyle(index: Int): Int {
        val position = getInt(index, REGULAR_ROBOTO_FONT)
        return try {
            robotoStyles[position]
        } catch (e: Exception) {
            robotoStyles[REGULAR_ROBOTO_FONT]
        }
    }
    // endregion

    //region Roboto Span property functions
    protected inline fun fontProperty(position: () -> Int): SpanFontDelegate {
        val item = findSpan(position)
        return SpanFontDelegate(item) { updateSpanStyles() }
    }

    protected inline fun styleProperty(position: () -> Int): SpanStyleDelegate {
        val item = findSpan(position)
        return SpanStyleDelegate(item) { updateSpanStyles() }
    }
    // endregion

}

