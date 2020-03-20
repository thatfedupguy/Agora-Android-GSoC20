package com.example.agoraandroidgsoc20.di.module

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

}

