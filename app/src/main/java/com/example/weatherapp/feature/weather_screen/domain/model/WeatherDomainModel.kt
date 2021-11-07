package com.example.weatherapp.feature.weather_screen.domain.model

data class WeatherDomainModel(
    val temperature: Double,
    val maxTemperature: Double,
    val minTemperature: Double,
    val windSpeed: Double,
    val deg: Int
)