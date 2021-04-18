package com.czh.yuji_2th.config

import android.app.Application

object AppConfig {

    lateinit var app: Application
        private set

    val context get() = app.applicationContext

    fun init(app: Application) {
        this.app = app
    }
}
