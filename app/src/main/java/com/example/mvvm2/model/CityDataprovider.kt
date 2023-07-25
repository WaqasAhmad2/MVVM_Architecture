package com.example.mvvm2.model

import com.example.mvvm2.R

class CityDataprovider {

    private val cities = arrayListOf<City>()

    init{

        cities.add(City("Lahore", img = R.drawable.download,100000))
        cities.add(City("Karachi", img = R.drawable.download1,200000))
        cities.add(City("Islamabad", img = R.drawable.download2,300000))
    }

    fun getCities() = cities

}