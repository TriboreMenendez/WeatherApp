package com.example.weatherapp.feature.weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

class WindMainModel(
    @SerializedName("speed") val speed: Double,
    @SerializedName("deg") val deg: Int
)

//"wind": {
//    "speed": 1.5,
//    "deg": 350