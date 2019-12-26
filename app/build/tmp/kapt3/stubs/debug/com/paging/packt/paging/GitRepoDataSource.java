package com.paging.packt.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0016H\u0016J*\u0010\u0018\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001aH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/paging/packt/paging/GitRepoDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/paging/packt/paging/GitRepo;", "()V", "initialLoading", "Landroidx/lifecycle/MutableLiveData;", "Lcom/paging/packt/paging/NetworkState;", "getInitialLoading", "()Landroidx/lifecycle/MutableLiveData;", "maxPage", "getMaxPage", "()I", "setMaxPage", "(I)V", "networkState", "getNetworkState", "loadAfter", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Companion", "app_debug"})
public final class GitRepoDataSource extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.paging.packt.paging.GitRepo> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.paging.packt.paging.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.paging.packt.paging.NetworkState> initialLoading = null;
    private int maxPage;
    public static final int PAGE_SIZE = 10;
    public static final int FIRST_PAGE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOPIC = "alexxx";
    public static final com.paging.packt.paging.GitRepoDataSource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.paging.packt.paging.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.paging.packt.paging.NetworkState> getInitialLoading() {
        return null;
    }
    
    public final int getMaxPage() {
        return 0;
    }
    
    public final void setMaxPage(int p0) {
    }
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.paging.packt.paging.GitRepo> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.paging.packt.paging.GitRepo> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.paging.packt.paging.GitRepo> callback) {
    }
    
    public GitRepoDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/paging/packt/paging/GitRepoDataSource$Companion;", "", "()V", "FIRST_PAGE", "", "PAGE_SIZE", "TOPIC", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}