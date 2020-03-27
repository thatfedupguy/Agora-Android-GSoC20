package com.example.agoraandroidgsoc20.ui.fragments.auth

import com.example.agoraandroidgsoc20.data.db.entities.User

interface AuthListener {

    fun onStarted()
    fun onFailure(message : String)
    fun onSuccess(user : User)
}