package com.example.agoraandroidgsoc20.ui.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.databinding.ProfileFragmentBinding
import kotlinx.android.synthetic.main.profile_fragment.*
import kotlinx.android.synthetic.main.profile_fragment.view.*
import javax.inject.Inject

class ProfileFragment
    @Inject
    constructor(
        private val viewModelFactory: ViewModelProvider.Factory
    ): Fragment() {

    val viewModel: ProfileViewModel by viewModels {
        viewModelFactory
    }

    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =  inflater.inflate(R.layout.profile_fragment, container, false)

        rootView.btn_logout.setOnClickListener {
            viewModel.deleteUser()
            parentFragment?.findNavController()?.navigate(R.id.welcomeFragment)
        }

        return rootView
    }


}
