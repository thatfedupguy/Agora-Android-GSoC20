package com.example.agoraandroidgsoc20.ui.fragments.main

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.databinding.MainTabFragmentBinding
import com.example.agoraandroidgsoc20.ui.fragments.elections.ElectionsFragment
import com.example.agoraandroidgsoc20.ui.fragments.home.HomeFragment
import com.example.agoraandroidgsoc20.ui.fragments.notifications.NotificationFragment
import com.example.agoraandroidgsoc20.ui.fragments.profile.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainTabFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =  inflater.inflate(R.layout.main_tab_fragment, container, false)
        val binding = DataBindingUtil.bind<MainTabFragmentBinding>(rootView)!!
        binding.bottomNavigation.setOnNavigationItemSelectedListener(
            onBottomNavigationItemSelectedListener
        )
        if (childFragmentManager.findFragmentById(R.id.container) == null) {
            replaceFragment(HomeFragment())
            title(getString(R.string.home))
        }
        return rootView
    }

    private val onBottomNavigationItemSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                    title(getString(R.string.agora))
                }
                R.id.elections -> {
                    replaceFragment(ElectionsFragment())
                    title(getString(R.string.elections))
                }
                R.id.notifications -> {
                    replaceFragment(NotificationFragment())
                    title(getString(R.string.notifications))
                }
                R.id.profile -> {
                    replaceFragment(ProfileFragment())
                    title(getString(R.string.profile))
                }
            }
            true
        }

    private fun replaceFragment(fragment: Fragment) {
        Handler().postDelayed( Runnable {
            val manager: FragmentManager = childFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()
            transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            transaction.replace(R.id.container, fragment)
            transaction.commitAllowingStateLoss()
            //transaction.commit();
        }, 300)
    }

    private fun title(name: String){
        (activity as AppCompatActivity).supportActionBar?.title = name
    }

}
