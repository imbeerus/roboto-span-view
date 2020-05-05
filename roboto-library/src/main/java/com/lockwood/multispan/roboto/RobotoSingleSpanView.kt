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
import com.lockwood.multispan.extensions.fetchSingleSpanAttrs
import com.lockwood.multispan.roboto.base.RobotoMultiSpanView
import com.lockwood.multispan.roboto.spannable.RobotoSingleSpan
import com.lockwood.multispan.spannable.SingleSpan.Companion.ITEM_FIRST
import com.lockwood.multispan.spannable.SingleSpan.Companion.ONE_ITEM_COUNT

open class RobotoSingleSpanView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : RobotoMultiSpanView(context, attrs, defStyleAttr), RobotoSingleSpan {

    override var spansCount = ONE_ITEM_COUNT

    override var firstText by textProperty { ITEM_FIRST }
    override var firstTextSize by textSizeProperty { ITEM_FIRST }
    override var firstTextColor by textColorProperty { ITEM_FIRST }
    override var firstSeparator by textSeparatorProperty { ITEM_FIRST }

    override var firstFont by fontProperty { ITEM_FIRST }
    override var firstStyle by styleProperty { ITEM_FIRST }

    init {
        fetchSingleSpanAttrs(context, attrs, defaultTextSize, defaultTextColor)

        fetchAttrs(R.styleable.RobotoSingleSpanView, context, attrs) {
            firstFont = getRobotoFontFamily(R.styleable.RobotoSingleSpanView_firstRobotoFont)
            firstStyle = getRobotoFontStyle(R.styleable.RobotoSingleSpanView_firstRobotoFont)
        }
    }

}