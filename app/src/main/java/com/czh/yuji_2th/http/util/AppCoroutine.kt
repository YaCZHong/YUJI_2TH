package com.czh.yuji_2th.http.util

import android.util.Log
import com.czh.yuji_2th.BuildConfig
import kotlinx.coroutines.CoroutineExceptionHandler

object AppCoroutine {

    private const val TAG = "AppCoroutine"

    val handler = CoroutineExceptionHandler { context, throwable ->
        Log.e(TAG, "coroutine($context) error occur: $throwable")
        if (BuildConfig.DEBUG) {
            throw throwable
        }
    }
}
