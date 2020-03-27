package com.example.agoraandroidgsoc20.di.module

import android.app.Application
import com.example.agoraandroidgsoc20.data.db.AppDatabase
import com.example.agoraandroidgsoc20.data.db.PreferenceProvider
import com.example.agoraandroidgsoc20.data.network.Api
import com.example.agoraandroidgsoc20.data.network.NetworkConnectionInterceptor
import com.example.agoraandroidgsoc20.data.repository.ElectionsRepository
import com.example.agoraandroidgsoc20.data.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
object AppModule {

    @JvmStatic
    @Provides
    fun providesPreferenceProvider(app: Application): PreferenceProvider{
        return PreferenceProvider(app.baseContext)
    }

    @JvmStatic
    @Provides
    fun providesNetworkConnectionIntercepter(app: Application): NetworkConnectionInterceptor {
        return NetworkConnectionInterceptor(app.baseContext)
    }

    @JvmStatic
    @Provides
    fun providesApi(networkConnectionInterceptor: NetworkConnectionInterceptor): Api {
        return Api(networkConnectionInterceptor)
    }

    @JvmStatic
    @Provides
    fun provideAppDatabase(app: Application): AppDatabase {
        return AppDatabase(app.baseContext)
    }


    @JvmStatic
    @Provides
    fun providesElectionsRepository(): ElectionsRepository {
        return ElectionsRepository()
    }
    @JvmStatic
    @Provides
    fun providesUserRepository(
        api: Api,
        appDatabase: AppDatabase,
        prefs: PreferenceProvider
    ): UserRepository {
        return UserRepository(api, appDatabase,prefs)
    }
}


//    @Singleton
//    @Provides
//    fun provideUserRepository(
//        api: Api,
//        db: AppDatabase
//    ): UserRepository {
//        return UserRepository(api, db)
//    }
//
//    @Singleton
//    @Provides
//    fun provideLoginFragment(
//        viewModelFactory: ViewModelProvider.Factory
//    ): Fragment {
//        return LoginFragment(
//            viewModelFactory
//        )
//    }




