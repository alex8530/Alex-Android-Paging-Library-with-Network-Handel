package com.paging.packt.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/paging/packt/paging/GitRepoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "gitRepoPagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/paging/packt/paging/GitRepo;", "getGitRepoPagedList", "()Landroidx/lifecycle/LiveData;", "setGitRepoPagedList", "(Landroidx/lifecycle/LiveData;)V", "initialLoading", "Lcom/paging/packt/paging/NetworkState;", "getInitialLoading", "setInitialLoading", "itemDataSourceFactory", "Lcom/paging/packt/paging/GitRepoDataSourceFactory;", "getItemDataSourceFactory", "()Lcom/paging/packt/paging/GitRepoDataSourceFactory;", "setItemDataSourceFactory", "(Lcom/paging/packt/paging/GitRepoDataSourceFactory;)V", "liveDataSource", "Lcom/paging/packt/paging/GitRepoDataSource;", "networkState", "getNetworkState", "setNetworkState", "refresh", "", "app_debug"})
public final class GitRepoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.paging.packt.paging.GitRepoDataSourceFactory itemDataSourceFactory;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.paging.packt.paging.GitRepo>> gitRepoPagedList;
    private androidx.lifecycle.LiveData<com.paging.packt.paging.GitRepoDataSource> liveDataSource;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> networkState;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> initialLoading;
    
    @org.jetbrains.annotations.NotNull()
    public final com.paging.packt.paging.GitRepoDataSourceFactory getItemDataSourceFactory() {
        return null;
    }
    
    public final void setItemDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.paging.packt.paging.GitRepoDataSourceFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.paging.packt.paging.GitRepo>> getGitRepoPagedList() {
        return null;
    }
    
    public final void setGitRepoPagedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.paging.packt.paging.GitRepo>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> getNetworkState() {
        return null;
    }
    
    public final void setNetworkState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> getInitialLoading() {
        return null;
    }
    
    public final void setInitialLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.paging.packt.paging.NetworkState> p0) {
    }
    
    public final void refresh() {
    }
    
    public GitRepoViewModel() {
        super();
    }
}