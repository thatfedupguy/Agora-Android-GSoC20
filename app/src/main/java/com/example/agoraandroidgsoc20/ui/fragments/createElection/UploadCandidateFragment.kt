package com.example.agoraandroidgsoc20.ui.fragments.createElection


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.data.model.Election
import com.example.agoraandroidgsoc20.ui.fragments.elections.ElectionItem
import com.example.agoraandroidgsoc20.utils.Coroutines
import com.example.agoraandroidgsoc20.utils.titleForActionBar
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.elections_fragment.*
import kotlinx.android.synthetic.main.fragment_upload_candidate.view.*

/**
 * A simple [Fragment] subclass.
 */
class UploadCandidateFragment : Fragment() {

    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        titleForActionBar(getString(R.string.create_election))
        rootView = inflater.inflate(R.layout.fragment_upload_candidate, container, false)
        rootView.btn_proceed.setOnClickListener {
            Navigation.findNavController(rootView).navigate(UploadCandidateFragmentDirections.actionUploadCandidateFragmentToUploadElection())
        }
        return rootView
    }


}
