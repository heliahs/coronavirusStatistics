package com.hh.coronalastupdate.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hh.coronalastupdate.models.Country


class DetailViewModel(country: Country,
                      app: Application
) : AndroidViewModel(app){
    private val _selectedCountry = MutableLiveData<Country>()

    // The external LiveData for the SelectedProperty
    val selectedCountry: LiveData<Country>
        get() = _selectedCountry

    // Initialize the _selectedProperty MutableLiveData
    init {
        _selectedCountry.value = country
    }
}