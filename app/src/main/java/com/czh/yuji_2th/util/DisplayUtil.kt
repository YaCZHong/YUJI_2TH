package com.czh.yuji_2th.util


import android.content.Context
import android.graphics.Point
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.WindowManager
import com.czh.yuji_2th.R
import com.czh.yuji_2th.config.AppConfig
import kotlin.math.roundToInt


val screenWidth: Int
    get() {
        return screenSize.x
    }

val screenHeight: Int
    get() {
        return screenSize.y
    }

private val screenSize: Point by lazy {
    val wm: WindowManager =
        AppConfig.context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val size = Point()
    wm.defaultDisplay.getRealSize(size)
    return@lazy size
}

/**
 * 获得屏幕高度(不包含底部虚拟按键)
 */
private fun innerGetDisplayHeight(): Int {
    val wm =
        AppConfig.context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val outMetrics = DisplayMetrics()
    wm.defaultDisplay.getMetrics(outMetrics)
    return outMetrics.heightPixels
}

val statusBarHeight: Int by lazy { innerGetStatusBarHeight() }

private fun innerGetStatusBarHeight(): Int {
    var result = 0
    val resourceId =
        AppConfig.context.resources.getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) {
        result = AppConfig.context.resources.getDimensionPixelSize(resourceId)
    }
    return result
}

val actionBarHeight: Int by lazy { innerGetActionBarHeight() }

private fun innerGetActionBarHeight(): Int {
    var result = 0
    val tv = TypedValue()
    if (AppConfig.context.theme.resolveAttribute(R.attr.actionBarSize, tv, true)) {
        result = TypedValue.complexToDimensionPixelSize(
            tv.data,
            AppConfig.context.resources.displayMetrics
        )
    }
    return result
}

val navigationBarHeight: Int by lazy { innerGetNavigationBarHeight() }

fun innerGetNavigationBarHeight(): Int {
    return screenHeight - innerGetDisplayHeight()
}

fun dp2px(dp: Int): Int {
    return dp2px(dp.toFloat())
}

fun dp2px(dp: Float): Int {
    val metrics = AppConfig.context.resources.displayMetrics
    val px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, metrics)
    return px.roundToInt()
}

fun sp2px(sp: Int): Int {
    return sp2px(sp.toFloat())
}

fun sp2px(sp: Float): Int {
    val metrics = AppConfig.context.resources.displayMetrics
    val px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, metrics)
    return px.roundToInt()
}
