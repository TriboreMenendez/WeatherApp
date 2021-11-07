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
import org.w3c.dom.Text
import java.lang.Exception

class WeatherScreenActivity : AppCompatActivity() {
    val weatherScreenViewModel by viewModel<WeatherScreenViewModel>()
    val defaultCity = "Москва"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val getWeatherButton = findViewById<Button>(R.id.button)
        weatherScreenViewModel.lifeData.observe(this, Observer(::render))

        weatherScreenViewModel.requestWeather(defaultCity)
        findViewById<TextView>(R.id.city_text).text = defaultCity

        getWeatherButton.setOnClickListener {
            val city = findViewById<EditText>(R.id.input_city_edit_text).text.toString()
            weatherScreenViewModel.requestWeather(city)
            findViewById<TextView>(R.id.city_text).text = city
        }
    }

    private fun render(state: WeatherDomainModel) {

        val temp = state.temperature.toInt()
        val max =
            if (state.maxTemperature > 0) "+ ${state.maxTemperature.toInt()}"
            else state.maxTemperature.toInt()
        val min =
            if (state.minTemperature > 0) "+ ${state.minTemperature.toInt()}"
            else state.minTemperature.toInt()
        findViewById<TextView>(R.id.textViewTemperature).text = temp.toString() + " C"
        findViewById<TextView>(R.id.temp_max_min).text = "$max / $min"
    }


}