package com.lockwood.multispan.roboto.delegate

import com.lockwood.multispan.delegate.base.SpanDelegate
import com.lockwood.multispan.item.SpanItem
import com.lockwood.multispan.roboto.item.RobotoSpanItem
import kotlin.reflect.KProperty

class SpanStyleDelegate(
    spanItem: SpanItem,
    override val onSet: () -> Unit
) : SpanDelegate<Int>(spanItem) {

    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return (spanItem as RobotoSpanItem).style
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        (spanItem as RobotoSpanItem).style = value
        onSet()
    }

}