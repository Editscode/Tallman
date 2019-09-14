package com.vrlab_dev.tallman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.acrivity_ktk_notification.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acrivity_ktk_notification)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewPage.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPage)
    }
}
