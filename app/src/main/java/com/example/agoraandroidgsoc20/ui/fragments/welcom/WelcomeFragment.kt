package com.example.agoraandroidgsoc20.ui.fragments.welcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.data.db.PreferenceProvider
import com.example.agoraandroidgsoc20.utils.hideActionBar
import com.example.agoraandroidgsoc20.utils.statusBarColor
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
        hideActionBar()
        statusBarColor( R.color.white)



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
