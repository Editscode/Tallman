package com.vrlab_dev.tallman.ui.manifest

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.vrlab_dev.tallman.data.vo.Voyager
import io.reactivex.disposables.CompositeDisposable
import java.net.CacheResponse

class VesselViewModel(private val detailResponse: Datails) : ViewModel() {
    // TODO: Implement the ViewModel
    private val compositeDisposable = CompositeDisposable()
    val voyagerDetails : LiveData<Voyager> by lazy{

    }
}
