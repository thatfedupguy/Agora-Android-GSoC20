package com.example.agoraandroidgsoc20.di.util

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.ui.fragments.auth.LoginFragment
import com.example.agoraandroidgsoc20.ui.fragments.auth.SignupFragment
import com.example.agoraandroidgsoc20.ui.fragments.createElection.UploadCandidateFragment
import com.example.agoraandroidgsoc20.ui.fragments.createElection.UploadElection
import com.example.agoraandroidgsoc20.ui.fragments.createElection.UploadElectionDetailsFragment
import com.example.agoraandroidgsoc20.ui.fragments.home.HomeFragment
import com.example.agoraandroidgsoc20.ui.fragments.main.MainTabFragment
import com.example.agoraandroidgsoc20.ui.fragments.welcom.WelcomeFragment
import javax.inject.Inject

class MainFragmentFactory
@Inject
constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when (className) {
            WelcomeFragment::class.java.name -> {
                WelcomeFragment()
            }

            UploadElectionDetailsFragment::class.java.name -> {
                UploadElectionDetailsFragment()
            }

            UploadCandidateFragment::class.java.name -> {
                UploadCandidateFragment()
            }

            UploadElection::class.java.name -> {
                UploadElection()
            }

            LoginFragment::class.java.name -> {
                LoginFragment(
                    viewModelFactory
                )
            }

            SignupFragment::class.java.name -> {
                SignupFragment()
            }

            MainTabFragment::class.java.name -> {
                MainTabFragment(viewModelFactory)
            }

            else -> {
                WelcomeFragment()
            }
        }
}