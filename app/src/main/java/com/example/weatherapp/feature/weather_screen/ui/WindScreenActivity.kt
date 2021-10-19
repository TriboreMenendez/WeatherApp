package com.example.weatherapp.feature.weather_screen.ui

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.weatherapp.R
import com.example.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel
import org.koin.android.viewmodel.ext.android.viewModel


class WindScreenActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)
        weatherScreenViewModel.lifeData.observe(this, Observer(::wind))
        weatherScreenViewModel.requestWeather("Moscow")
    }

    private fun wind(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tvWind).let {
            it.text = "${getString(R.string.wind_speed)}: ${state.windSpeed}"
        }
    }
}