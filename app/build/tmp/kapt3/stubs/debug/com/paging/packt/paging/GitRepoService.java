package com.paging.packt.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/paging/packt/paging/GitRepoService;", "", "getRepositories", "Lretrofit2/Call;", "Lcom/paging/packt/paging/GitRepoResponse;", "page", "", "size", "topic", "", "app_debug"})
public abstract interface GitRepoService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories?sort=stars")
    public abstract retrofit2.Call<com.paging.packt.paging.GitRepoResponse> getRepositories(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int size, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String topic);
}