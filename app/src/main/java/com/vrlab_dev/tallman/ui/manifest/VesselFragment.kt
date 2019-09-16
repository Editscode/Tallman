package com.vrlab_dev.tallman.ui.manifest

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.vrlab_dev.tallman.R

class VesselFragment : Fragment() {

    companion object {
        fun newInstance() = VesselFragment()
    }

    private lateinit var viewModel: VesselViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vessel_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VesselViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
