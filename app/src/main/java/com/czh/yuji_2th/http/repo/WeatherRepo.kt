package com.czh.yuji_2th.http.repo

import com.czh.yuji_2th.http.HttpManager
import com.czh.yuji_2th.http.api.WeatherApi
import com.czh.yuji_2th.http.response.CaiYunWeatherResponse

object WeatherRepo {
    private val api = HttpManager.retrofit.create(WeatherApi::class.java)

    suspend fun getWeather(location: String, lang: String): CaiYunWeatherResponse {
        return api.getWeather(location = location, lang = lang)
    }
}