package com.example.agoraandroidgsoc20.ui.fragments.elections

import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.data.model.Election
import com.example.agoraandroidgsoc20.databinding.ListItemElectionBinding
import com.xwray.groupie.databinding.BindableItem

class ElectionItem(
    private val election : Election
) : BindableItem<ListItemElectionBinding>(){

    override fun getLayout(): Int = R.layout.list_item_election

    override fun bind(viewBinding: ListItemElectionBinding, position: Int) {
        viewBinding.election = election
    }

}