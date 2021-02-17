package com.hh.coronadata.viewmodels

import android.app.Application

import androidx.lifecycle.*
import com.hh.coronalastupdate.models.Country
import com.hh.coronalastupdate.models.Global


class ListViewModel(application: Application) : AndroidViewModel(application) {
    enum class ApiStatus { LOADING, ERROR, DONE }

  //  private val repository = Repository(getDatabase(application))

    /**
     * A playlist of videos displayed on the screen.
     */
  //  val playlist = repository.listData
  //  val globalNew =repository.globalData

/* val _list = MutableLiveData<CountryData>()
    val list : LiveData<CountryData>
    get() = _list*/

    val _status = MutableLiveData<ApiStatus>()
    val status : LiveData<ApiStatus>
    get() = _status


    val _coronaItems = MutableLiveData<List<Country>>()
    val coronaItems : LiveData<List<Country>>
        get() = _coronaItems

    val _global = MutableLiveData<Global>()
    val global : LiveData<Global>
        get() = _global

    val _navigateToSelectedCountry = MutableLiveData<Country>()
    val navigateToSelectedCountry : LiveData<Country>
        get() = _navigateToSelectedCountry

init {
    //refreshDataFromRepository()

}


    /* fun refreshDataFromRepository() {
        viewModelScope.launch {
            try {
                repository.getData()

                _status.value=ApiStatus.DONE

            } catch (networkError: IOException) {
                Log.e("error" , networkError.message.toString())
                if(playlist.value.isNullOrEmpty())
                    _status.value =ApiStatus.ERROR

            }
        }
    }
*/

    fun displayDetails(country: Country) {
        _navigateToSelectedCountry.value = country
    }


    fun displayDetailsComplete() {
        _navigateToSelectedCountry.value = null
    }

}