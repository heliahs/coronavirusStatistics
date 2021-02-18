package com.hh.coronalastupdate.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.hh.coronalastupdate.db.CoronaDataDatabase
import com.hh.coronalastupdate.db.asDomainModel
import com.hh.coronalastupdate.models.*

import com.hh.coronalastupdate.network.MarsApi.RETROFIT_SERVICE


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository (private val database: CoronaDataDatabase) {


    val listData: LiveData<List<Country>> = Transformations.map(database.coronaInfoDao.getAll()) {
        it.asDomainModel()
    }
    val globalData : LiveData<Global> = database.globalDao.getAllGlobal()



    suspend fun getData() {
        withContext(Dispatchers.IO) {
            val coronaData = RETROFIT_SERVICE.getCoronaDataList()
            val global =coronaData.Global
      database.globalDao.insertAllGlobal(coronaData.asGlobalDatabaseModel(global))
            database.coronaInfoDao.insertAll(coronaData.asCountryDatabaseModel())
        }

    }
}
