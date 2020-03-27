package com.example.agoraandroidgsoc20.utils

import android.app.Activity
import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.agoraandroidgsoc20.ui.activities.MainActivity

fun Context.getString(@StringRes resId: Int) = getString(resId)

fun Fragment.hideActionBar() = (activity as AppCompatActivity).supportActionBar!!.hide()


fun Fragment.showActionBar() = (activity as AppCompatActivity).supportActionBar!!.show()

fun Fragment.titleForActionBar(title: String) = (activity as AppCompatActivity).supportActionBar!!.setTitle(title)

fun Fragment.statusBarColor(@ColorRes resId: Int) {
    activity!!.window.statusBarColor = ContextCompat.getColor(context!!, resId)
 }
