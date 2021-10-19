package com.example.weatherapp.feature.weather_screen.data

import com.example.weatherapp.feature.weather_screen.data.api.model.WeatherModel
import com.example.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel

fun WeatherModel.toDomain(): WeatherDomainModel {
    return WeatherDomainModel(
        this.main.temp,
        this.main.tempMax,
        this.wind.speed,
        this.wind.deg
    )
}