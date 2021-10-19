package com.example.weatherapp.feature.weather_screen.data.api

import com.example.weatherapp.feature.weather_screen.data.api.model.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

//API url api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
//API key: 98ad1327bb3191787b8682a0b04f6593

interface WeatherApi {
    @GET("data/2.5/weather")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("appid") apiKey: String = "98ad1327bb3191787b8682a0b04f6593",
        @Query("units") units: String = "metric"
    ) : WeatherModel
}