package com.example.home_task_l16.Adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.home_task_l16.Fragment.CountryFragment
import com.example.home_task_l16.Model.CountryInfo

class ViewPagerAdapter(activity: AppCompatActivity, private val list: List<CountryInfo>) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return CountryFragment.newInstance(list[position])
    }
}