package com.example.agoraandroidgsoc20.ui.fragments.home

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
import com.example.agoraandroidgsoc20.databinding.HomeFragmentBinding
import com.example.agoraandroidgsoc20.ui.fragments.main.MainTabFragmentDirections
import kotlinx.android.synthetic.main.home_fragment.view.*
import javax.inject.Inject

class HomeFragment
    : Fragment() {



    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.home_fragment, container, false)
        rootView.btn_create_election.setOnClickListener {
            parentFragment?.findNavController()?.navigate(R.id.uploadElectionDetailsFragment)
        }
        return rootView
    }

}
