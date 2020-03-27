package com.example.agoraandroidgsoc20.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.di.util.ViewModelKey
import com.example.agoraandroidgsoc20.ui.activities.MainViewModel
import com.example.agoraandroidgsoc20.ui.fragments.elections.ElectionsViewModel
import com.example.agoraandroidgsoc20.di.util.ViewModelFactory
import com.example.agoraandroidgsoc20.ui.fragments.auth.AuthViewModel
import com.example.agoraandroidgsoc20.ui.fragments.profile.ProfileViewModel
import com.example.agoraandroidgsoc20.ui.fragments.welcom.WelcomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindsViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindsMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ElectionsViewModel::class)
    internal abstract fun bindsElectionsViewModel(viewModel: ElectionsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    internal abstract fun bindsAuthViewModel(viewModel: AuthViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    internal abstract fun bindsWelcomeViewModel(viewModel: WelcomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    internal abstract fun bindsProfileViewModel(viewModel: ProfileViewModel): ViewModel

}