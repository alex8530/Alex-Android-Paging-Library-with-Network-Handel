package com.paging.packt.paging

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class GitRepoDataSource : PageKeyedDataSource<Int, GitRepo>() {

    val  networkState =  MutableLiveData<NetworkState>()
    val initialLoading  =  MutableLiveData<NetworkState>()
//
//    var maxPage= 0

    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, GitRepo>) {

        val service = GitRepoServiceBuilder.buildService(GitRepoService::class.java)
        val call = service.getRepositories(FIRST_PAGE, PAGE_SIZE, TOPIC)

        initialLoading.postValue(NetworkState.LOADING)
        networkState.postValue(NetworkState.LOADING)

        call.enqueue(object : Callback<GitRepoResponse> {

            // If you receive a HTTP Response, then this method is executed
            override fun onResponse(call: Call<GitRepoResponse>, response: Response<GitRepoResponse>) {

                if (response.isSuccessful) {

                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.items
//                    maxPage=apiResponse.totalCount

                    responseItems?.let {
                        callback.onResult(responseItems, null, FIRST_PAGE + 1)
                    }

                    initialLoading.postValue(NetworkState.LOADED)
                    networkState.postValue(NetworkState.LOADED)


                }else{
                    Log.d("","null")
                    initialLoading.postValue(NetworkState(Status.FAILED, response.message()))
                    networkState.postValue(NetworkState(Status.FAILED, response.message()))


                }
            }

            // Invoked in case of Network Error or Establishing connection with Server
            // or Error Creating Http Request or Error Processing Http Response
            override fun onFailure(call: Call<GitRepoResponse>, t: Throwable) {
                var errorMessage: String
                errorMessage = t.message.toString()
                networkState.postValue(NetworkState(Status.FAILED, errorMessage))

            }
        })

    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, GitRepo>) {
        val service = GitRepoServiceBuilder.buildService(GitRepoService::class.java)
        val call = service.getRepositories(params.key, PAGE_SIZE, TOPIC)


        networkState.postValue(NetworkState.LOADING)

        call.enqueue(object : Callback<GitRepoResponse> {



//            Constant.showHUDailog(this@ChangePasswordActivity , true)

            override fun onResponse(call: Call<GitRepoResponse>, response: Response<GitRepoResponse>) {

                if (response.isSuccessful) {

                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.items

                    //if we add this condition or not >>
                    //the library will automatic know when the pagelist is finish>>
                    //if the result return empty array so it know this is last page>>
//                    or i can this condition to prevent it to request last request to know if list is empty or not
//                    val key = if (max_page> params.key) params.key + 1 else max_page
                    val key=params.key + 1
                    responseItems?.let {
                        callback.onResult(responseItems, key)
                    }

                    networkState.postValue(NetworkState.LOADED)


                }else{
                    var t1  = response;
                    var t2  = response;

                    networkState.postValue(NetworkState(Status.FAILED, response.message()))



                }
            }

            override fun onFailure(call: Call<GitRepoResponse>, t: Throwable) {
                var t1  = t;
                var t2  = t;
                var errorMessage: String
                errorMessage = t.message.toString()
                networkState.postValue(NetworkState(Status.FAILED, errorMessage))


            }
        })

    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, GitRepo>) {

        val service = GitRepoServiceBuilder.buildService(GitRepoService::class.java)
        val call = service.getRepositories(params.key, PAGE_SIZE, TOPIC)
        var p = params.key;
        var p2 = params.key;
        call.enqueue(object : Callback<GitRepoResponse> {

            override fun onResponse(call: Call<GitRepoResponse>, response: Response<GitRepoResponse>) {

                if (response.isSuccessful) {

                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.items
                    var p = params.key;
                    var p2 = params.key;
                    val key = if (params.key > 1) params.key - 1 else 0


                    responseItems?.let {
                        callback.onResult(responseItems, key)
                    }
                }
            }

            override fun onFailure(call: Call<GitRepoResponse>, t: Throwable) {
            }
        })
    }

    companion object {
        const val PAGE_SIZE = 10
        const val FIRST_PAGE = 1
        const val TOPIC = "alexxx"  //becase this retuen 52 recordes>> so i will pagenate 5 times then stop>>
    }
}