package com.example.agoraandroidgsoc20.base

import android.app.Application
import com.example.agoraandroidgsoc20.di.component.AppComponent
import com.example.agoraandroidgsoc20.di.component.DaggerAppComponent

class BaseApplication : Application() {

    companion object {
        private lateinit var appComponent: AppComponent
        fun getAppInjector(): AppComponent {
            return appComponent
        }
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }

}
