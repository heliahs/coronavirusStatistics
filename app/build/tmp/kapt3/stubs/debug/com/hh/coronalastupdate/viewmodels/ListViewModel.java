package com.hh.coronalastupdate.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bJ\u0006\u0010&\u001a\u00020$J\u0006\u0010\'\u001a\u00020$R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/hh/coronalastupdate/viewmodels/ListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_coronaItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hh/coronalastupdate/models/Country;", "get_coronaItems", "()Landroidx/lifecycle/MutableLiveData;", "_global", "Lcom/hh/coronalastupdate/models/Global;", "get_global", "_navigateToSelectedCountry", "get_navigateToSelectedCountry", "_status", "Lcom/hh/coronalastupdate/viewmodels/ListViewModel$ApiStatus;", "get_status", "coronaItems", "Landroidx/lifecycle/LiveData;", "getCoronaItems", "()Landroidx/lifecycle/LiveData;", "global", "getGlobal", "globalNew", "getGlobalNew", "navigateToSelectedCountry", "getNavigateToSelectedCountry", "playlist", "getPlaylist", "repository", "Lcom/hh/coronalastupdate/repositories/Repository;", "status", "getStatus", "displayDetails", "", "country", "displayDetailsComplete", "refreshDataFromRepository", "ApiStatus", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.hh.coronalastupdate.repositories.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.hh.coronalastupdate.models.Country>> playlist = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> globalNew = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.viewmodels.ListViewModel.ApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.hh.coronalastupdate.models.Country>> _coronaItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.models.Global> _global = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.models.Country> _navigateToSelectedCountry = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hh.coronalastupdate.models.Country>> getPlaylist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> getGlobalNew() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.viewmodels.ListViewModel.ApiStatus> get_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coronalastupdate.viewmodels.ListViewModel.ApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hh.coronalastupdate.models.Country>> get_coronaItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.hh.coronalastupdate.models.Country>> getCoronaItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.models.Global> get_global() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Global> getGlobal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.hh.coronalastupdate.models.Country> get_navigateToSelectedCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Country> getNavigateToSelectedCountry() {
        return null;
    }
    
    public final void refreshDataFromRepository() {
    }
    
    public final void displayDetails(@org.jetbrains.annotations.NotNull()
    com.hh.coronalastupdate.models.Country country) {
    }
    
    public final void displayDetailsComplete() {
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/hh/coronalastupdate/viewmodels/ListViewModel$ApiStatus;", "", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "DONE", "app_debug"})
    public static enum ApiStatus {
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ DONE /* = new DONE() */;
        
        ApiStatus() {
        }
    }
}