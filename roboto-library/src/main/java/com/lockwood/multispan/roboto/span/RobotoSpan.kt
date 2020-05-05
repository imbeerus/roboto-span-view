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

package com.lockwood.multispan.roboto.span

import android.content.res.ColorStateList
import android.text.style.TextAppearanceSpan

class RobotoSpan(
    fontFamily: String = DEF_ROBOTO_FONT_FAMILY,
    style: Int = DEF_TEXT_STYLE,
    size: Int,
    color: ColorStateList
) : TextAppearanceSpan(fontFamily, style, size, color, color) {

    companion object {

        const val DEF_ROBOTO_FONT_FAMILY = "sans-serif" // regular
        const val DEF_TEXT_STYLE = 0 // normal - 0;  bold - 1; italic - 2
    }

}