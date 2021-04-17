package com.czh.yuji_2th.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.czh.yuji_2th.http.repo.WeatherRepo
import com.czh.yuji_2th.http.response.CaiYunWeatherResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * @Author: czh
 * @CreateDate: 2021/4/18 0:42
 */
class WeatherViewModel : ViewModel() {

    /**
     * 用来控制loading的显示和隐藏
     */
    var showLoading: MutableLiveData<Boolean> = MutableLiveData()

    /**
     * 用来接收api返回的数据
     */
    var weatherResponse: MutableLiveData<CaiYunWeatherResponse> = MutableLiveData()

    /**
     * @description: 拉取彩云api的天气数据
     * @params: location:经纬度（经度在前，纬度在后）,lang:语言
     * @author: czh
     */
    fun getWeather(location: String, lang: String = "zh_CN") {
        viewModelScope.launch(Dispatchers.Main) {
            showLoading.value = true
            try {
                val response = withContext(Dispatchers.IO) {
                    WeatherRepo.getWeather(location, lang)
                }
                weatherResponse.value = response
            } catch (e: Exception) {
                weatherResponse.value = null
            }
            showLoading.value = false
        }
    }
}