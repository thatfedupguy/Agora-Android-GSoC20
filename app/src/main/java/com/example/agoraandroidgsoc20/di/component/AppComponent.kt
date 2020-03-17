package com.example.agoraandroidgsoc20.di.component

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.di.module.AppModule
import com.example.agoraandroidgsoc20.di.module.ViewModelModule
import com.example.agoraandroidgsoc20.ui.activities.MainActivity
import com.example.agoraandroidgsoc20.utils.ViewModelFactory
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
