package com.example.agoraandroidgsoc20.ui.fragments.profile

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.agoraandroidgsoc20.data.db.PreferenceProvider
import com.example.agoraandroidgsoc20.data.repository.UserRepository
import com.example.agoraandroidgsoc20.utils.Coroutines
import javax.inject.Inject

const val TAG = "ProfileFragment"

class ProfileViewModel
    @Inject
    constructor(
        private val userRepository: UserRepository

    )
    : ViewModel() {

    fun deleteUser(){
        Coroutines.main {
            try{
                userRepository.deleteUser()
            }catch (e : Exception){
                Log.d(TAG,e.message!!)
            }
        }
    }
}
