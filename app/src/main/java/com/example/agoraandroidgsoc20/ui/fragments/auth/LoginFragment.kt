package com.example.agoraandroidgsoc20.ui.fragments.auth


import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.data.db.entities.User
import com.example.agoraandroidgsoc20.utils.*
import kotlinx.android.synthetic.main.fragment_login.*
//import com.example.agoraandroidgsoc20.data.db.entites.User
//import com.example.agoraandroidgsoc20.utils.hide
//import com.example.agoraandroidgsoc20.utils.show
//import com.example.agoraandroidgsoc20.utils.snackbar
import kotlinx.android.synthetic.main.fragment_login.view.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment
    @Inject
    constructor(
        private val viewModelFactory: ViewModelProvider.Factory
    )
    : Fragment(), AuthListener{

    private lateinit var rootView: View

    val viewModel: AuthViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView=  inflater.inflate(R.layout.fragment_login, container, false)
        titleForActionBar(getString(R.string.login))
        showActionBar()
        statusBarColor(R.color.colorPrimary)

        rootView.btn_skip.setOnClickListener {
            Navigation.findNavController(rootView).navigate(LoginFragmentDirections.actionLoginFragmentToMainTabFragment())
        }

        rootView.btn_login.setOnClickListener {
            viewModel.onLoginButtonClicked(til_username.editText?.text.toString(), til_password.editText?.text.toString())
        }
        viewModel.authListener = this

        viewModel.getLoggedInUser().observe(viewLifecycleOwner, Observer {
            if(it!=null){
                Navigation.findNavController(rootView).navigate(LoginFragmentDirections.actionLoginFragmentToMainTabFragment())
            }
        })
        return rootView
    }


    override fun onStarted() {
        rootView.progress_bar.show()
    }

    override fun onFailure(message: String) {
        rootView.progress_bar.hide()
        rootView.snackbar(message)
    }

    override fun onSuccess(user: User) {
        rootView.progress_bar.hide()
        rootView.snackbar(user.username!!)
    }

}
