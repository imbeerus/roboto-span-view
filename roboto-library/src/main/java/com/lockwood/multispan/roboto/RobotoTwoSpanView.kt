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
import com.lockwood.multispan.extensions.fetchTwoSpanAttrs
import com.lockwood.multispan.roboto.extensions.fetchAttrs
import com.lockwood.multispan.roboto.spannable.RobotoTwoSpan
import com.lockwood.multispan.spannable.TwoSpan.Companion.ITEM_SECOND
import com.lockwood.multispan.spannable.TwoSpan.Companion.TWO_ITEMS_COUNT

open class RobotoTwoSpanView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : RobotoSingleSpanView(context, attrs, defStyleAttr), RobotoTwoSpan {

    override var spansCount = TWO_ITEMS_COUNT

    override var secondText by textProperty { ITEM_SECOND }
    override var secondTextSize by textSizeProperty { ITEM_SECOND }
    override var secondTextColor by textColorProperty { ITEM_SECOND }
    override var secondSeparator by textSeparatorProperty { ITEM_SECOND }

    override var secondFont by fontProperty { ITEM_SECOND }
    override var secondStyle by styleProperty { ITEM_SECOND }

    init {
        fetchTwoSpanAttrs(context, attrs, defaultTextSize, defaultTextColor)

        fetchAttrs(context, R.styleable.RobotoTwoSpanView, attrs) {
            secondFont = getRobotoFontFamily(R.styleable.RobotoTwoSpanView_secondRobotoFont)
            secondStyle = getRobotoFontStyle(R.styleable.RobotoTwoSpanView_secondRobotoFont)
        }
    }

}