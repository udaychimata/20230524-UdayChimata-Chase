package com.example.weather.response

data class Sys(val country: String = "",
               val sunrise: Int = 0,
               val sunset: Int = 0,
               val id: Int = 0,
               val type: Int = 0)