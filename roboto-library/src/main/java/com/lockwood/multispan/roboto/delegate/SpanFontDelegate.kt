package com.lockwood.multispan.roboto.delegate

import com.lockwood.multispan.delegate.base.SpanDelegate
import com.lockwood.multispan.item.SpanItem
import com.lockwood.multispan.roboto.item.RobotoSpanItem
import kotlin.reflect.KProperty

class SpanFontDelegate(
    spanItem: SpanItem,
    override val onSet: () -> Unit
) : SpanDelegate<String>(spanItem) {

    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return (spanItem as RobotoSpanItem).fontFamily
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        (spanItem as RobotoSpanItem).fontFamily = value
        onSet()
    }

}
