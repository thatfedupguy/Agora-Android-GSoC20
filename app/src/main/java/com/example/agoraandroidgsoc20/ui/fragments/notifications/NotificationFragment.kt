package com.example.agoraandroidgsoc20.ui.fragments.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.databinding.NotificationFragmentBinding
import javax.inject.Inject

class NotificationFragment
    @Inject
    constructor(
        private val viewModelFactory: ViewModelProvider.Factory
    ): Fragment() {

    val viewModel: NotificationViewModel by viewModels {
        viewModelFactory
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.notification_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = DataBindingUtil.bind<NotificationFragmentBinding>(view)

    }

}
