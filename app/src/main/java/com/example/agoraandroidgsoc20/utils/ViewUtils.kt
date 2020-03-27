package com.example.agoraandroidgsoc20.utils

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import com.google.android.material.snackbar.Snackbar


fun ProgressBar.hide(){
    visibility = ProgressBar.GONE
}

fun ProgressBar.show(){
    visibility = ProgressBar.VISIBLE
}
fun View.snackbar(message: String) {
    Snackbar
        .make(this, message, Snackbar.LENGTH_INDEFINITE)
        .also { snackbar ->
            snackbar.setAction("OK") {
                snackbar.dismiss()
            }
        }.show()

}

