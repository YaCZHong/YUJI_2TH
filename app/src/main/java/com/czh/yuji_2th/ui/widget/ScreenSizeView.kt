package com.czh.yuji_2th.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.czh.yuji_2th.util.*

class ScreenSizeView constructor(context: Context, attrs: AttributeSet) :
    View(context, attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(
            screenWidth,
            screenHeight - statusBarHeight - actionBarHeight - navigationBarHeight
        )
    }
}