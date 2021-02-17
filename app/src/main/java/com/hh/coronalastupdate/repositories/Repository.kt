package com.hh.coronalastupdate.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.hh.coronalastupdate.db.CoronaDataDatabase
import com.hh.coronalastupdate.db.TableGlobal
import com.hh.coronalastupdate.db.asDomainModel
import com.hh.coronalastupdate.models.Country
import com.hh.coronalastupdate.models.asDatabaseModel
import com.hh.coronalastupdate.network.MarsApi.retrofitService


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository (private val database: CoronaDataDatabase) {


    val listData: LiveData<List<Country>> = Transformations.map(database.coronaInfoDao.getAll()) {
        it.asDomainModel()
    }
 //   val globalData : LiveData<Global> = database.globalDao.getAllGlobal()



    suspend fun getData() {
        withContext(Dispatchers.IO) {
            val coronaData = retrofitService.getCoronaDataList()
            val global =coronaData.Global
      database.globalDao.insertAllGlobal(
          TableGlobal( NewConfirmed = global.NewConfirmed,
              TotalConfirmed = global.TotalConfirmed,
              TotalDeaths = global.TotalDeaths,
              NewDeaths = global.NewDeaths,
              NewRecovered = global.NewConfirmed,
              TotalRecovered = global.TotalRecovered )
      )

            database.coronaInfoDao.insertAll(coronaData.asDatabaseModel())
        }

    }
}
