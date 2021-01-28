package com.example.home_task_l16.Model

class CountryInfo(
        val name : String,
        val population : Int,
        val area: Int
){
    var density: Float = (population/area).toFloat()
}
