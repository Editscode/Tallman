package com.vrlab_dev.tallman.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vrlab_dev.tallman.data.api.modelInterface.JsonPlaceHolderApi
import com.vrlab_dev.tallman.data.vo.Manifest
import com.vrlab_dev.tallman.data.vo.Voyager
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.lang.Exception
import kotlin.math.log

class DetailsNetworkDataSourse(private val apiServise: JsonPlaceHolderApi,private val compositeDisposable: CompositeDisposable) {
    private val _networkState = MutableLiveData<NetworkState>()
    val networkState: LiveData<NetworkState>
        get() = _networkState
    private  val _downloadedResponse = MutableLiveData<Voyager>()
    val downloadedResponse: LiveData<Voyager>
        get() = _downloadedResponse
    fun fetchDetails(){
        _networkState.postValue(NetworkState.LOADING)
        try {
            compositeDisposable.add(
                apiServise.getVoyager()
                    .subscribeOn(Schedulers.io())
                    .subscribe(
                        {
                            _downloadedResponse.postValue(it)
                            _networkState.postValue(NetworkState.LOADED)
                        },
                        {
                            _networkState.postValue(NetworkState.ERROR)
                            Log.e("more details",it.message)
                        }
                    )
            )
        }
        catch (e: Exception ){

        }
    }

}