package com.hh.coronalastupdate.db

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*

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


@Database(entities = [TableCountries::class,TableGlobal::class], version = 2)
abstract class CoronaDataDatabase: RoomDatabase() {
    abstract val coronaInfoDao: CoronaInfoDao
    abstract val  globalDao: GlobalDao
}

private lateinit var INSTANCE: CoronaDataDatabase

fun getDatabase(context: Context): CoronaDataDatabase {
    synchronized(CoronaDataDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                CoronaDataDatabase::class.java,
                "corona").build()
        }
    }
    return INSTANCE
}
