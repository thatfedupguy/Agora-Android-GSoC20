package com.example.agoraandroidgsoc20.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.base.BaseApplication.Companion.getAppInjector
import com.example.agoraandroidgsoc20.data.db.PreferenceProvider
import com.example.agoraandroidgsoc20.ui.fragments.auth.AuthViewModel
import com.example.agoraandroidgsoc20.ui.fragments.main.MainTabFragment
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var mainFragmentFactory: FragmentFactory

    @Inject
    lateinit var prefs: PreferenceProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        getAppInjector().inject(this)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hostFragment = supportFragmentManager.findFragmentById(R.id.host_fragment)
        hostFragment!!.childFragmentManager.fragmentFactory = mainFragmentFactory
        if (hostFragment is NavHostFragment)
            navController = hostFragment.navController

        if(prefs.getIsLoggedIn()){
            navController.navigate(R.id.mainTabFragment)
        }

    }

    override fun onBackPressed() {
        val hostFragment = supportFragmentManager.findFragmentById(R.id.host_fragment)
        if (hostFragment is NavHostFragment) {
            val currentFragment = hostFragment.childFragmentManager.fragments.first()
            if (currentFragment is MainTabFragment) {
                moveTaskToBack(true)
                return
            }
        }else{
            super.onBackPressed()
        }
    }

}
