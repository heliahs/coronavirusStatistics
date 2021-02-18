package com.hh.coronalastupdate.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hh.coronalastupdate.models.Global

@Dao
interface CoronaInfoDao {
    @Query("select * from tablecountries")
    fun getAll(): LiveData<List<TableCountries>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll( coronaInfo: List<TableCountries>)

}


@Dao
interface GlobalDao{

    @Query("select * from tableglobal")
    fun getAllGlobal(): LiveData<Global>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllGlobal( tableGlobal: TableGlobal)
}