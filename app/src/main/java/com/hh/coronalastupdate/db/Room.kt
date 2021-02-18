package com.hh.coronalastupdate.db

import android.content.Context
import androidx.room.*






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
