package com.example.agoraandroidgsoc20.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.agoraandroidgsoc20.data.model.Election
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ElectionsRepository{

    private val liveElections = MutableLiveData<List<Election>>()
    private val elections: LiveData<List<Election>> = liveElections

     suspend fun generate() : LiveData<List<Election>> {
         return withContext(Dispatchers.IO){
             fetchElections()
         }
    }

    private fun fetchElections(): LiveData<List<Election>>{
        val dummyElections: ArrayList<Election> = ArrayList()
            for(i in 1..10){
                val election = Election(
                    i, "SR Election", "Elections for Student Representative in University", "Active",
                    "Fri Jan 24 12:00:00" ,"Fri Jan 24 18:00:00"
                )
                dummyElections.add(election)
            }
        liveElections.postValue(dummyElections)
        return elections

    }


}