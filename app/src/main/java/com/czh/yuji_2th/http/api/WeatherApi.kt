package com.czh.yuji_2th.http.api

import com.czh.yuji_2th.BuildConfig
import com.czh.yuji_2th.http.response.CaiYunWeatherResponse
import retrofit2.http.*

interface WeatherApi {

    @GET("{token}/{location}/{returnType}")
    suspend fun getWeather(
        @Path("token") token: String = BuildConfig.CAIYUN_TOKEN,
        @Path("location") location: String,
        @Path("returnType") returnType: String = "weather.json",
        @Query("lang") lang: String,
        @Query("unit") unit: String = "metric",
        @Query("hourlysteps") hourlysteps: Int = 24,
        @Query("dailysteps") dailysteps: Int = 15,
        @Query("alert") alert: Boolean = true
    ): CaiYunWeatherResponse
}