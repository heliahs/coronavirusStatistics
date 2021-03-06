package com.hh.coronalastupdate.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/hh/coronalastupdate/db/GlobalDao;", "", "getAllGlobal", "Landroidx/lifecycle/LiveData;", "Lcom/hh/coronalastupdate/models/Global;", "insertAllGlobal", "", "tableGlobal", "Lcom/hh/coronalastupdate/db/TableGlobal;", "app_debug"})
public abstract interface GlobalDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from tableglobal")
    public abstract androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> getAllGlobal();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllGlobal(@org.jetbrains.annotations.NotNull()
    com.hh.coronalastupdate.db.TableGlobal tableGlobal);
}