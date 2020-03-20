package com.example.agoraandroidgsoc20.ui.fragments.welcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.agoraandroidgsoc20.R
import kotlinx.android.synthetic.main.welcome_fragment.view.*


class WelcomeFragment : Fragment() {

    companion object {
        fun newInstance() = WelcomeFragment()
    }

    private lateinit var rootView: View

    private lateinit var viewModel: WelcomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.welcome_fragment, container, false)
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.white)

        rootView.btn_login.setOnClickListener {
            Navigation.findNavController(rootView).
                navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment())
        }

        rootView.btn_signup.setOnClickListener {
            Navigation.findNavController(rootView).
                navigate(WelcomeFragmentDirections.actionWelcomeFragmentToSignupFragment())
        }
        return rootView
    }
}
