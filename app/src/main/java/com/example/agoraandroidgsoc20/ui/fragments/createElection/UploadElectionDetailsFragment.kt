package com.example.agoraandroidgsoc20.ui.fragments.createElection


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.agoraandroidgsoc20.R

/**
 * A simple [Fragment] subclass.
 */
class UploadElectionDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload_election_details, container, false)
    }


}
