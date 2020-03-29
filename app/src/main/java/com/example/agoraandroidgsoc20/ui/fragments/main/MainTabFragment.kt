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
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.databinding.MainTabFragmentBinding
import com.example.agoraandroidgsoc20.ui.fragments.elections.ElectionsFragment
import com.example.agoraandroidgsoc20.ui.fragments.home.HomeFragment
import com.example.agoraandroidgsoc20.ui.fragments.notifications.NotificationFragment
import com.example.agoraandroidgsoc20.ui.fragments.profile.ProfileFragment
import com.example.agoraandroidgsoc20.utils.showActionBar
import com.example.agoraandroidgsoc20.utils.statusBarColor
import com.example.agoraandroidgsoc20.utils.titleForActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.home_fragment.view.*
import javax.inject.Inject


class MainTabFragment
    @Inject
    constructor(
        private val viewModelFactory: ViewModelProvider.Factory
    ): Fragment() {

    private lateinit var rootView: View

    val viewModel: MainTabViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        titleForActionBar(getString(R.string.home))
        showActionBar()
        statusBarColor(R.color.colorPrimary)

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
                    replaceFragment(ElectionsFragment(viewModelFactory))
                    title(getString(R.string.elections))
                }
                R.id.notifications -> {
                    replaceFragment(NotificationFragment(viewModelFactory))
                    title(getString(R.string.notifications))
                }
                R.id.profile -> {
                    replaceFragment(ProfileFragment(viewModelFactory))
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
        (requireActivity() as AppCompatActivity).supportActionBar?.title = name
    }





}
