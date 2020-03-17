package com.example.agoraandroidgsoc20.ui.fragments.elections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.data.model.Election
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.elections_fragment.*

class ElectionsFragment : Fragment() {

    private lateinit var viewModel: ElectionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.elections_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ElectionsViewModel::class.java)
        BindUI()
    }

    private fun BindUI() = initRecyclerView(viewModel.generate().toElectionItem())

    private fun initRecyclerView(electionItem: List<ElectionItem>) {
        val mAdapter = GroupAdapter<ViewHolder>().apply{
            addAll(electionItem)
        }
        rv_elections.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = mAdapter
        }
    }

    private fun List<Election>.toElectionItem() : List<ElectionItem>{
        return this.map {
            ElectionItem(it)
        }
    }


}
