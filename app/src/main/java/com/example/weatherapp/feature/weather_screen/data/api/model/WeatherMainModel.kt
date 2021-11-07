package com.example.weatherapp.feature.weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("temp")
    val temp: Double,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("speed")
    val windSpeed: String
) {
//    "main": {
//    "temp": 282.55,
//    "feels_like": 281.86,
//    "temp_min": 280.37,
//    "temp_max": 284.26,
//    "pressure": 1023,
//    "humidity": 100)
//}

/*    "visibility": 16093,
    "wind": {
        "speed": 1.5,
        "deg": 350
*/
}
