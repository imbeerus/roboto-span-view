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

package com.lockwood.multispan.roboto

import android.content.Context
import android.util.AttributeSet
import com.lockwood.multispan.extensions.fetchAttrs
import com.lockwood.multispan.extensions.fetchFourSpanAttrs
import com.lockwood.multispan.roboto.spannable.RobotoFourSpan
import com.lockwood.multispan.spannable.FourSpan.Companion.FOUR_ITEMS_COUNT
import com.lockwood.multispan.spannable.FourSpan.Companion.ITEM_FOURTH

open class RobotoFourSpanView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : RobotoThreeSpanView(context, attrs, defStyleAttr), RobotoFourSpan {

    override var spansCount = FOUR_ITEMS_COUNT

    override var fourthText by textProperty { ITEM_FOURTH }
    override var fourthTextSize by textSizeProperty { ITEM_FOURTH }
    override var fourthTextColor by textColorProperty { ITEM_FOURTH }
    override var fourthSeparator by textSeparatorProperty { ITEM_FOURTH }

    override var fourthFont by fontProperty { ITEM_FOURTH }
    override var fourthStyle by styleProperty { ITEM_FOURTH }

    init {
        fetchFourSpanAttrs(context, attrs, defaultTextSize, defaultTextColor)

        fetchAttrs(R.styleable.RobotoFourSpanView, context, attrs) {
            fourthFont = getRobotoFontFamily(R.styleable.RobotoFourSpanView_fourthRobotoFont)
            fourthStyle = getRobotoFontStyle(R.styleable.RobotoFourSpanView_fourthRobotoFont)
        }
    }
}