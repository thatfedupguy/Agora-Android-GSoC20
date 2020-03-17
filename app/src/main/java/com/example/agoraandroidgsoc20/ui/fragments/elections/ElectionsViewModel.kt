package com.example.agoraandroidgsoc20.ui.fragments.elections

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.agoraandroidgsoc20.data.model.Election

class ElectionsViewModel : ViewModel() {
    lateinit var elections : ArrayList<Election>

    fun generate() : ArrayList<Election>{
        elections = ArrayList()
        for(i in 1..10){
            var election = Election(
                i, "SR Election", "Elections for Student Representative in University", "Active",
                "Fri Jan 24 12:00:00" ,"Fri Jan 24 18:00:00"
            )
            elections.add(election)
        }
        return elections
    }
}
