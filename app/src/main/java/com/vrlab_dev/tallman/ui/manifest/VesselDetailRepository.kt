package com.vrlab_dev.tallman.ui.manifest

import com.vrlab_dev.tallman.data.api.modelInterface.JsonPlaceHolderApi
import com.vrlab_dev.tallman.data.repository.DetailsNetworkDataSourse
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.AbstractExecutorService
import javax.sql.CommonDataSource

class VesselDetailRepository (private val apiService : JsonPlaceHolderApi) {
    lateinit var movieDetailNetworkDataSource: DetailsNetworkDataSourse
    fun fetchSingleMovieDetails (compositeDisposable: CompositeDisposable,)
}