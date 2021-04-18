package com.czh.yuji_2th.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.czh.yuji_2th.R
import com.czh.yuji_2th.base.BaseFragment

class WeatherFragment private constructor() : BaseFragment() {

    companion object {

        private const val LOCATION = "LOCATION"

        fun newInstance(location: String): WeatherFragment {
            return WeatherFragment().apply {
                arguments = Bundle().apply {
                    putString(LOCATION, location)
                }
            }
        }
    }

    private lateinit var mLocation: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmet_weather, container, false)
        initArgument()
        return view
    }

    private fun initArgument() {
        mLocation = arguments?.getString(LOCATION, "") ?: ""
    }
}