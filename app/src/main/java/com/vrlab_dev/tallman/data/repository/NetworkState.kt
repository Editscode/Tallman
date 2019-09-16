package com.vrlab_dev.tallman.data.repository



enum class Status {
    RUNING,
    SUCCESS,
    FAILD
}
class NetworkState(val status: Status, val msg : String){
    companion object{
        val LOADED:NetworkState
        val LOADING:NetworkState
        val ERROR: NetworkState
        init {
            LOADED = NetworkState(Status.SUCCESS,"SUCCESS")
            LOADING = NetworkState(Status.RUNING,"RUNING")
            ERROR = NetworkState(Status.FAILD,"FAILD")
        }
    }
}