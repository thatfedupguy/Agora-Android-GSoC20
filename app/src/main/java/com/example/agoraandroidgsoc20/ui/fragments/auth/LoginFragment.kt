package com.example.agoraandroidgsoc20.ui.fragments.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation

import com.example.agoraandroidgsoc20.R
import kotlinx.android.synthetic.main.fragment_login.view.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView=  inflater.inflate(R.layout.fragment_login, container, false)
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.colorPrimary)

        rootView.btn_login.setOnClickListener {
            Navigation.findNavController(rootView).
                navigate(LoginFragmentDirections.actionLoginFragmentToMainTabFragment())
        }


        return rootView
    }


}
