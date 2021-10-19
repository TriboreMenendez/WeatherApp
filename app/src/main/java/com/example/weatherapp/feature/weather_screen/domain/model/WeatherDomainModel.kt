package com.example.weatherapp.feature.weather_screen.domain.model

data class WeatherDomainModel(
    val temperature: String,
    val maxTemperature: String,
    val windSpeed: Double,
    val deg: Int
)