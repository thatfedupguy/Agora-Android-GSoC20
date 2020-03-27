package com.example.agoraandroidgsoc20.di.module

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.di.util.MainFragmentFactory
import dagger.Module
import dagger.Provides

@Module
object FragmentModule{

    @JvmStatic
    @Provides
    fun providesMainFragmentFactory(
        viewModelFactory: ViewModelProvider.Factory
    ): FragmentFactory {
        return MainFragmentFactory(
            viewModelFactory
        )
    }

}