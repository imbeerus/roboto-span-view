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

package com.lockwood.multispan.roboto.item

import android.content.res.ColorStateList
import android.text.style.CharacterStyle
import androidx.annotation.ColorInt
import com.lockwood.multispan.item.SpanItem
import com.lockwood.multispan.roboto.span.RobotoSpan
import com.lockwood.multispan.roboto.span.RobotoSpan.Companion.DEF_ROBOTO_FONT_FAMILY
import com.lockwood.multispan.roboto.span.RobotoSpan.Companion.DEF_TEXT_STYLE

class RobotoSpanItem(
    override var text: String = "",
    override var textSize: Int,
    @ColorInt override var textColor: Int,
    override var separator: String = "",
    var fontFamily: String = DEF_ROBOTO_FONT_FAMILY,
    var style: Int = DEF_TEXT_STYLE
) : SpanItem {

    override fun buildSpan(position: Int): CharacterStyle {
        return RobotoSpan(fontFamily, style, textSize, textColor.toStateList())
    }

    private fun Int.toStateList(): ColorStateList {
        return ColorStateList.valueOf(this)
    }

}