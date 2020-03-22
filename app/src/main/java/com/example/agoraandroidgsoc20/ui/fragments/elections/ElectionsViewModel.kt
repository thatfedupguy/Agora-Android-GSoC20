package com.example.agoraandroidgsoc20.ui.fragments.elections

import androidx.lifecycle.ViewModel
import com.example.agoraandroidgsoc20.data.model.repository.ElectionsRepository
import com.example.agoraandroidgsoc20.utils.lazyDeferred
import javax.inject.Inject

class ElectionsViewModel
    @Inject
    constructor(
        private val electionsRepository: ElectionsRepository
    )
    : ViewModel() {

    val elections by lazyDeferred{
        val electionsRepository = ElectionsRepository()
        electionsRepository.generate()
    }


}
