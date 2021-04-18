package com.czh.yuji_2th.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.czh.yuji_2th.base.BaseActivity
import com.czh.yuji_2th.databinding.ActivityMainBinding
import com.czh.yuji_2th.ui.adapter.WeatherPagerAdapter
import com.czh.yuji_2th.ui.fragment.WeatherFragment
import com.czh.yuji_2th.viewmodel.WeatherViewModel

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModels<WeatherViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherResponse.observe(this, Observer {
            Log.d("xh", it?.toString() ?: "获取天气数据失败")
        })

        viewModel.showLoading.observe(this, Observer {
            Log.d("xh", it?.toString() ?: "null")
        })
        viewModel.getWeather("112.15,23.11")

        initView()
        initData()
    }

    private fun initView() {
        binding.vp.adapter = WeatherPagerAdapter(this, mutableListOf())
    }

    private fun initData() {
        val fragments = mutableListOf<WeatherFragment>()
        fragments.add(WeatherFragment.newInstance("112.15,23.11"))
        fragments.add(WeatherFragment.newInstance("113.15,26.11"))

        (binding.vp.adapter as WeatherPagerAdapter).updateFragment(fragments)
        binding.vp.offscreenPageLimit = fragments.size
        binding.vp.currentItem = fragments.size - 1
    }
}