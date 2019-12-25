package com.paging.packt.paging

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList

class GitRepoViewModel : ViewModel() {
     var itemDataSourceFactory: GitRepoDataSourceFactory
    var gitRepoPagedList: LiveData<PagedList<GitRepo>>
    private var liveDataSource: LiveData<GitRepoDataSource>


      var networkState: LiveData<NetworkState>
      var initialLoading: LiveData<NetworkState>



    init {
          itemDataSourceFactory = GitRepoDataSourceFactory()
        liveDataSource = itemDataSourceFactory.gitRepoLiveDataSource



        networkState =
            Transformations.switchMap(itemDataSourceFactory.gitRepoLiveDataSource ) {
                    dataSource -> dataSource.networkState
            }



        initialLoading=
            Transformations.switchMap(itemDataSourceFactory.gitRepoLiveDataSource ) {
                    dataSource -> dataSource.initialLoading
            }




        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(GitRepoDataSource.PAGE_SIZE)
            .build()

        gitRepoPagedList = LivePagedListBuilder(itemDataSourceFactory, config)
            .build()
    }



    //this is for refresh data>>>
    fun refresh() {

        itemDataSourceFactory.gitRepoLiveDataSource .value?.invalidate()
    }
}