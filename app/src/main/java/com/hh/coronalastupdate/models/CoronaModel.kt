package com.hh.coronalastupdate.models

import android.os.Parcelable


import kotlinx.android.parcel.Parcelize


data class CoronaModel(
    val Countries: List<Country>,
    val Global : Global
)
@Parcelize
data class Country(
    val Country: String,
    val CountryCode: String,
    val Slug: String,
    val NewConfirmed: Long,
    val TotalConfirmed: Long,
    val NewDeaths: Long,
    val TotalDeaths: Long,
    val NewRecovered: Long,
    val TotalRecovered: Long,
    val Date: String
): Parcelable

data class Global(
    val NewConfirmed: Long,
    val TotalConfirmed: Long,
    val NewDeaths: Long,
    val TotalDeaths: Long,
    val NewRecovered: Long,
    val TotalRecovered: Long

)

/*

fun CoronaModel.asDomainModel(): List<Country> {
    return Countries.map {
        Country(
            Country = it.Country,
            CountryCode = it.CountryCode,
            Slug = it.Slug,
            NewConfirmed = it.NewConfirmed,
            TotalConfirmed = it.TotalConfirmed,
            TotalDeaths = it.TotalDeaths,
            NewDeaths = it.NewDeaths,
            NewRecovered = it.NewConfirmed,
            TotalRecovered = it.TotalRecovered,
            Date = it.Date
          )
    }


}
*/




/*
fun CoronaModel.asDatabaseModel(): List<TableCountries> {
    return Countries.map {
        TableCountries(
            Country = it.Country,
            CountryCode = it.CountryCode,
            Slug = it.Slug,
            NewConfirmed = it.NewConfirmed,
            TotalConfirmed = it.TotalConfirmed,
            TotalDeaths = it.TotalDeaths,
            NewDeaths = it.NewDeaths,
            NewRecovered = it.NewConfirmed,
            TotalRecovered = it.TotalRecovered,
            Date = it.Date
           )
    }
}

*/



