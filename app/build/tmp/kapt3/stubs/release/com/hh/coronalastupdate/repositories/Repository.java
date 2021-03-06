package com.hh.coronalastupdate.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/hh/coronalastupdate/repositories/Repository;", "", "database", "Lcom/hh/coronalastupdate/db/CoronaDataDatabase;", "(Lcom/hh/coronalastupdate/db/CoronaDataDatabase;)V", "globalData", "Landroidx/lifecycle/LiveData;", "Lcom/hh/coronalastupdate/models/Global;", "getGlobalData", "()Landroidx/lifecycle/LiveData;", "listData", "", "Lcom/hh/coronalastupdate/models/Country;", "getListData", "getData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.hh.coronalastupdate.models.Country>> listData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> globalData = null;
    private final com.hh.coronalastupdate.db.CoronaDataDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hh.coronalastupdate.models.Country>> getListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> getGlobalData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.hh.coronalastupdate.db.CoronaDataDatabase database) {
        super();
    }
}