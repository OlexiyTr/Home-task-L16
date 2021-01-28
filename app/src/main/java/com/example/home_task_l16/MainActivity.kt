package com.example.home_task_l16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_task_l16.Adapter.ViewPagerAdapter
import com.example.home_task_l16.Model.CountryInfo

import com.example.home_task_l16.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var listOfCountries : ArrayList<CountryInfo> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupDataOfCountries()
        setupViewPager()
        setupTabLayout()
    }

    private fun setupDataOfCountries(){
        listOfCountries =
            arrayListOf(
                CountryInfo(
                    "Ukraine",
                    41723998,
                    603549
                ),
                CountryInfo(
                    "USA",
                    328915700,
                    9519431
                ),
                CountryInfo(
                    "Germany",
                    83019200,
                    357385
                ),
                CountryInfo(
                    "Monaco",
                    37863,
                    2),
                CountryInfo(
                    "Luxembourg",
                    602005,
                    2586
                )
            )
    }
    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupViewPager(){
        binding.viewPager.adapter =
            ViewPagerAdapter(
                this,
                listOfCountries
            )
    }

    private fun setupTabLayout(){
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = listOfCountries[position].name
        }.attach()
    }
}