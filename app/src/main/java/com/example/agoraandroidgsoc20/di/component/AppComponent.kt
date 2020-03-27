package com.example.agoraandroidgsoc20.di.component

import android.app.Application
import com.example.agoraandroidgsoc20.di.module.AppModule
import com.example.agoraandroidgsoc20.di.module.FragmentModule
import com.example.agoraandroidgsoc20.di.module.ViewModelModule
import com.example.agoraandroidgsoc20.ui.activities.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelModule::class, FragmentModule::class])
interface AppComponent {



    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }


    fun inject(activity: MainActivity)
}
