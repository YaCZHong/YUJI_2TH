package com.czh.yuji_2th.ui.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.czh.yuji_2th.ui.fragment.WeatherFragment

class WeatherPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val fragments: MutableList<WeatherFragment>
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): WeatherFragment {
        return fragments[position]
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    fun updateFragment(fragments: List<WeatherFragment>) {
        this.fragments.clear()
        this.fragments.addAll(fragments)
        this.notifyDataSetChanged()
    }
}
