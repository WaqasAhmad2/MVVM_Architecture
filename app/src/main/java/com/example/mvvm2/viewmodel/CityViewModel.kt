package com.example.mvvm2.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm2.model.City
import com.example.mvvm2.model.CityDataprovider

class CityViewModel : ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataprovider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    private fun loop()
    {
        Handler( Looper.getMainLooper() ).postDelayed({ updateCity() },delay)
    }

    fun getCityData() : LiveData<City> = cityData

    private fun updateCity()
    {
        currentIndex++
        currentIndex %= cities.size
        cityData.value = cities[currentIndex]
        loop()
    }
}