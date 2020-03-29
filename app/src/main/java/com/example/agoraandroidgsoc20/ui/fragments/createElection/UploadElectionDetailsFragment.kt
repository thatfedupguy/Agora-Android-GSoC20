package com.example.agoraandroidgsoc20.ui.fragments.createElection


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.utils.titleForActionBar
import kotlinx.android.synthetic.main.fragment_upload_election_details.view.*

/**
 * A simple [Fragment] subclass.
 */
class UploadElectionDetailsFragment : Fragment() {

    companion object{
        fun newInstance() = UploadElectionDetailsFragment()
    }

    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        titleForActionBar(getString(R.string.create_election))
        rootView = inflater.inflate(R.layout.fragment_upload_election_details, container, false)
        rootView.btn_proceed.setOnClickListener {
            parentFragment?.findNavController()?.navigate(R.id.uploadCandidateFragment)
        }
        return rootView
    }


}
