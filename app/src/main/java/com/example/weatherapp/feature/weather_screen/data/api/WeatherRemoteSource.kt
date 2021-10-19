package com.example.weatherapp.feature.weather_screen.data.api

import com.example.weatherapp.feature.weather_screen.data.api.model.WeatherModel

class WeatherRemoteSource(val api: WeatherApi) {

    suspend fun getWeather(cityName: String) : WeatherModel {
        return api.getWeather(cityName)
    }
}