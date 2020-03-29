package com.example.agoraandroidgsoc20.ui.fragments.createElection


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.utils.titleForActionBar
import kotlinx.android.synthetic.main.fragment_upload_election.view.*

/**
 * A simple [Fragment] subclass.
 */
class UploadElection : Fragment() {

    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        titleForActionBar(getString(R.string.create_election))
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_upload_election, container, false)
        rootView.submit_details_btn.setOnClickListener {
            parentFragment?.findNavController()?.navigate(R.id.mainTabFragment)
        }
        return rootView
    }


}
