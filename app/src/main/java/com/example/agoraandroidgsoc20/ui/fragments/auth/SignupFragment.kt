package com.example.agoraandroidgsoc20.ui.fragments.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.agoraandroidgsoc20.R
import kotlinx.android.synthetic.main.fragment_signup.view.*

/**
 * A simple [Fragment] subclass.
 */
class SignupFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_signup, container, false)
        rootView.btn_signup.setOnClickListener {
            Navigation.findNavController(rootView).
                navigate(SignupFragmentDirections.actionSignupFragmentToLoginFragment())
        }
        return rootView
    }


}
