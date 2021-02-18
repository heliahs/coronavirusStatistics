package com.hh.coronalastupdate.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hh.coronalastupdate.models.Country



@Entity
data class TableCountries constructor(
    @PrimaryKey
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

   )


@Entity
data class TableGlobal (
        @PrimaryKey(autoGenerate = true)
        var Id: Long = 0L,
        @ColumnInfo(name = "NewConfirmed")
        val NewConfirmed: Long=0L,
        @ColumnInfo(name = "TotalConfirmed")
        val TotalConfirmed: Long =0L,
        @ColumnInfo(name = "NewDeaths")
        val NewDeaths: Long=0L,
        @ColumnInfo(name = "TotalDeaths")
        val TotalDeaths: Long=0L,
        @ColumnInfo(name = "NewRecovered")
        val NewRecovered: Long=0L,
        @ColumnInfo(name = "TotalRecovered")
        val TotalRecovered: Long=0L

)




fun List<TableCountries>.asDomainModel(): List<Country> {
    return map {
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
