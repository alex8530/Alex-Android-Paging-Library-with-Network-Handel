package com.paging.packt.paging

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {



      lateinit  var   itemViewModel:GitRepoViewModel
    lateinit  var  adapter : GitRepoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Constant.showHUDailog(this,true)

        adapter = GitRepoAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)

         itemViewModel = ViewModelProviders.of(this).get(GitRepoViewModel::class.java)

        itemViewModel.gitRepoPagedList.observe(this, Observer {


            adapter.submitList(it)

            if (swip.isRefreshing) {

                swip.setRefreshing(false);
            }
        })

        recyclerView.adapter = adapter

        val service = GitRepoServiceBuilder.buildService(GitRepoService::class.java)
        val call = service.getRepositories(1, 10, "android")
        call.enqueue(object: Callback<GitRepoResponse> {

            override fun onResponse(call: Call<GitRepoResponse>, response: Response<GitRepoResponse>) {

                if (response.isSuccessful) {
                    val apiResponse = response.body()!!
                    val responseItems = apiResponse.items

                    val size = responseItems?.let {
                        responseItems.size.toString()
                    }

                    Toast.makeText(this@MainActivity, size, Toast.LENGTH_LONG).show()
                }else{

                    Toast.makeText(this@MainActivity, "hh", Toast.LENGTH_LONG).show()

                }
            }

            override fun onFailure(call: Call<GitRepoResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_LONG).show()

            }
        })

        swip.setColorSchemeColors(resources.getColor(R.color.colorAccent))
        swip.setOnRefreshListener {

            ///update
            if (swip.isRefreshing) {

                itemViewModel.refresh()
                swip.setRefreshing(false);

            }
        }



        itemViewModel.networkState.observe(this,   Observer {
            adapter.setNetworkState(it)

            Log.d("networkState","Network State Change" + it.msg + it.status)
        })


        itemViewModel.initialLoading.observe(this,   Observer {
//             adapter.setNetworkState(it)

            when(it){
                NetworkState.LOADING-> Constant.showHUDailog(this,true) //show it
                NetworkState.LOADED , NetworkState.FALIED -> Constant.showHUDailog(this,false) //hide it
            }

        })




    }
}
