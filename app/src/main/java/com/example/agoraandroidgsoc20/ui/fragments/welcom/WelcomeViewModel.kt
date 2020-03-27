package com.example.agoraandroidgsoc20.ui.fragments.welcom

import androidx.lifecycle.ViewModel
import com.example.agoraandroidgsoc20.data.repository.UserRepository
import javax.inject.Inject

class WelcomeViewModel
    @Inject
    constructor(
        private val userRepository: UserRepository
    ) : ViewModel() {

    fun getLoggedInUser() = userRepository.getUser()

}
