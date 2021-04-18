package com.czh.yuji_2th

import android.app.Application
import com.czh.yuji_2th.config.AppConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        AppConfig.init(this)
    }
}