package com.czh.yuji_2th

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.czh.yuji_2th.viewmodel.WeatherViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<WeatherViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.weatherResponse.observe(this, Observer {
            Log.d("xh", it?.toString() ?: "获取天气数据失败")
        })

        viewModel.showLoading.observe(this, Observer {
            Log.d("xh", it?.toString() ?: "null")
        })
        viewModel.getWeather("112.15,23.11")
    }
}