package com.example.agoraandroidgsoc20.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.agoraandroidgsoc20.data.db.entities.User
import com.example.agoraandroidgsoc20.data.repository.UserRepository
import com.example.agoraandroidgsoc20.utils.ApiException
import com.example.agoraandroidgsoc20.utils.Coroutines
import com.example.agoraandroidgsoc20.utils.NoInternetException
import javax.inject.Inject


class AuthViewModel
    @Inject
        constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var authListener: AuthListener? = null

    fun getLoggedInUser() = userRepository.getUser()

    fun onLoginButtonClicked(identifier: String?, password: String?) {
        authListener?.onStarted()
        if (identifier.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid Email or Password")
            return
        }
        Coroutines.main {
            try{
                val authResponse = userRepository.userLogin(identifier, password)
                authResponse.let {
                    val user = User(it.username, it.email, it.firstName, it.lastName, it.towFactorAuthentication)
                    authListener?.onSuccess(user)
                    userRepository.saveUser(user)
                    return@main
                }
            }catch (e : ApiException){
                authListener?.onFailure(e.message!!)
            }catch (e : NoInternetException){
                authListener?.onFailure(e.message!!)
            }catch (e : Exception){
                authListener?.onFailure(e.message!!)
            }
        }
    }
}