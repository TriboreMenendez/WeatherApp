package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.weatherapp.feature.weather_screen.ui.WeatherScreenActivity
import com.example.weatherapp.feature.weather_screen.ui.WindScreenActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherButton = findViewById<Button>(R.id.get_weather)
        weatherButton.setOnClickListener {
            Intent(this, WeatherScreenActivity::class.java).also { startActivity(it) }
        }

        val windButton = findViewById<Button>(R.id.get_wind)
        windButton.setOnClickListener {
            Intent(this, WindScreenActivity::class.java).also { startActivity(it) }
        }
    }
}