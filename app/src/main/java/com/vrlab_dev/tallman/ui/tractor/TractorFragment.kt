package com.vrlab_dev.tallman.ui.tractor


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.vrlab_dev.tallman.R

/**
 * A simple [Fragment] subclass.
 */
class TractorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tractor, container, false)
    }


}
