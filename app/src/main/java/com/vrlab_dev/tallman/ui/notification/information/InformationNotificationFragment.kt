package com.vrlab_dev.tallman.ui.notification.information

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.vrlab_dev.tallman.R

class InformationNotificationFragment : Fragment() {

    companion object {
        fun newInstance() = InformationNotificationFragment()
    }

    private lateinit var viewModel: InformationNotificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.information_notification_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InformationNotificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
