package com.vrlab_dev.tallman.ui.notificationKtk


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.vrlab_dev.tallman.R

import kotlinx.android.synthetic.main.fragment_notification_ktk.*
import androidx.fragment.app.FragmentActivity
import android.app.Activity








/**
 * A simple [Fragment] subclass.
 */
class NotificationKtkFragment : Fragment(),View.OnClickListener {
    private var myContext: FragmentActivity? = null
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_notification_ktk, container, false)
    }
    override fun onAttach(activity: Activity) {
        myContext = activity as FragmentActivity
        super.onAttach(activity)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragManager = myContext!!.getSupportFragmentManager()

        val fragmentAdapter = MyPagerAdapter(fragManager)
        viewPage.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPage)
    }


    override fun onClick(v: View?) {
        when(v!!.id){

        }
    }

}
