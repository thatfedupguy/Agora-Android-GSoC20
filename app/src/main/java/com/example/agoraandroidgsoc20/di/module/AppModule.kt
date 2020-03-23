package com.example.agoraandroidgsoc20.di.module

import com.example.agoraandroidgsoc20.data.repository.ElectionsRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
internal class AppModule {

    @Singleton
    @Provides
    fun providesRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesElectionsRepository(): ElectionsRepository {
        return ElectionsRepository()
    }



}

