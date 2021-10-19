package com.example.weatherapp.feature.weather_screen.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel
import com.example.weatherapp.R
import org.koin.android.viewmodel.ext.android.viewModel
import java.lang.Exception

class WeatherScreenActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("myLog", "App open")
        setContentView(R.layout.activity_weather)

        val getWeatherButton = findViewById<Button>(R.id.button)
        weatherScreenViewModel.lifeData.observe(this, Observer(::render))

        getWeatherButton.setOnClickListener {
            val city = findViewById<EditText>(R.id.editCity).text.toString()
            if (city != null) weatherScreenViewModel.requestWeather(city)
        }
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.textViewTemperature).let {
            it.text = "${getString(R.string.temperature)}: ${state.temperature} C"
        }
    }


}