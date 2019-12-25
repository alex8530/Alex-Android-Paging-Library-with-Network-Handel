package com.paging.packt.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/paging/packt/paging/GitRepoResponse;", "", "()V", "items", "", "Lcom/paging/packt/paging/GitRepo;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "totalCount", "", "getTotalCount", "()I", "setTotalCount", "(I)V", "app_debug"})
public final class GitRepoResponse {
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private int totalCount;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.paging.packt.paging.GitRepo> items;
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final void setTotalCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.paging.packt.paging.GitRepo> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.paging.packt.paging.GitRepo> p0) {
    }
    
    public GitRepoResponse() {
        super();
    }
}