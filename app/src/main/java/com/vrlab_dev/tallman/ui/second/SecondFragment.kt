package com.vrlab_dev.tallman.ui.second


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vrlab_dev.tallman.R
import com.vrlab_dev.tallman.ui.login.LoginViewModel

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {
    var navController: NavController? = null
    private lateinit var viewModel: SeconViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SeconViewModel::class.java)
        viewModel.loadPosts()
            navController?.navigate(R.id.action_secondFragment_to_vesselFragment)



    }


}
