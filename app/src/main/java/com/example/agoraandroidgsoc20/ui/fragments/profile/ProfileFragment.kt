package com.example.agoraandroidgsoc20.ui.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.databinding.ProfileFragmentBinding
import javax.inject.Inject

class ProfileFragment
    @Inject
    constructor(
        private val viewModelFactory: ViewModelProvider.Factory
    ): Fragment() {

    val viewModel: ProfileViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = DataBindingUtil.bind<ProfileFragmentBinding>(view)!!
    }

}
