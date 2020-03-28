package com.example.agoraandroidgsoc20.data.repository

import android.util.Log
import com.example.agoraandroidgsoc20.data.db.AppDatabase
import com.example.agoraandroidgsoc20.data.db.PreferenceProvider
import com.example.agoraandroidgsoc20.data.db.entities.User
import com.example.agoraandroidgsoc20.data.network.Api
import com.example.agoraandroidgsoc20.data.network.ValidApiRequest
import com.example.agoraandroidgsoc20.data.network.responses.AuthResponse
import org.json.JSONObject
import javax.inject.Inject

class UserRepository
    @Inject
        constructor(
    private val api : Api,
    private val db : AppDatabase,
    private val prefs: PreferenceProvider
) : ValidApiRequest() {

    suspend fun userLogin(identifier: String, password: String): AuthResponse {
        val jsonObject = JSONObject()
        jsonObject.put("identifier", identifier)
        jsonObject.put("password", password)
        return apiRequest{ api.logIn(jsonObject.toString())}
    }

    suspend fun saveUser(user : User) {
        Log.d("friday","saveuser")
        db.getUserDao().upsert(user)
        prefs.setIsloggedIn(true)
    }
    fun  getUser() = db.getUserDao().getUser()

    suspend fun deleteUser() {
        db.getUserDao().nukeUser()
        prefs.setIsloggedIn(false)
    }


}