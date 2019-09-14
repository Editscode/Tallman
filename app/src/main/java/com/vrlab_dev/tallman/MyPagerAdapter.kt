package com.vrlab_dev.tallman

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.vrlab_dev.tallman.ui.notification.damage.DamageNotificationFragment
import com.vrlab_dev.tallman.ui.notification.information.InformationNotificationFragment
import com.vrlab_dev.tallman.ui.notification.seals.SealsNotificationFragment

class MyPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0->{
                InformationNotificationFragment()
            }
            1->{
                SealsNotificationFragment()
            }
            else->{
                return DamageNotificationFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){

            0->"Информация"
            1->"Пломбы"
            else->{
                return "Повреждения"
            }
        }
    }

}