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
import com.lockwood.multispan.extensions.fetchThreeSpanAttrs
import com.lockwood.multispan.roboto.spannable.RobotoThreeSpan
import com.lockwood.multispan.spannable.ThreeSpan.Companion.ITEM_THIRD
import com.lockwood.multispan.spannable.ThreeSpan.Companion.THREE_ITEMS_COUNT

open class RobotoThreeSpanView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : RobotoTwoSpanView(context, attrs, defStyleAttr), RobotoThreeSpan {

    override var spansCount = THREE_ITEMS_COUNT

    override var thirdText by textProperty { ITEM_THIRD }
    override var thirdTextSize by textSizeProperty { ITEM_THIRD }
    override var thirdTextColor by textColorProperty { ITEM_THIRD }
    override var thirdSeparator by textSeparatorProperty { ITEM_THIRD }

    override var thirdFont by fontProperty { ITEM_THIRD }
    override var thirdStyle by styleProperty { ITEM_THIRD }

    init {
        fetchThreeSpanAttrs(context, attrs, defaultTextSize, defaultTextColor)

        fetchAttrs(R.styleable.RobotoThreeSpanView, context, attrs) {
            thirdFont = getRobotoFontFamily(R.styleable.RobotoThreeSpanView_thirdRobotoFont)
            thirdStyle = getRobotoFontStyle(R.styleable.RobotoThreeSpanView_thirdRobotoFont)
        }
    }

}