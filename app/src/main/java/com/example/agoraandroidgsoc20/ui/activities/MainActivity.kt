package com.example.agoraandroidgsoc20.ui.activities

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.base.BaseApplication.Companion.getAppInjector
import javax.inject.Inject
import javax.inject.Named


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAppInjector().inject(this)

        val hostFragment = supportFragmentManager.findFragmentById(R.id.host_fragment)
        if (hostFragment is NavHostFragment)
            navController = hostFragment.navController


    }
}
