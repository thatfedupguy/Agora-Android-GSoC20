package com.example.agoraandroidgsoc20.ui.fragments.createElection


import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.agoraandroidgsoc20.R
import com.example.agoraandroidgsoc20.utils.titleForActionBar
import kotlinx.android.synthetic.main.fragment_upload_election_details.view.*
import java.util.*
import kotlin.collections.ArrayList


/**
 * A simple [Fragment] subclass.
 */
class UploadElectionDetailsFragment : Fragment() {

    companion object{
        fun newInstance() = UploadElectionDetailsFragment()
    }

    lateinit var rootView: View

    lateinit var algorithms: ArrayList<String>

    lateinit var algorithmsAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        titleForActionBar(getString(R.string.create_election))
        rootView = inflater.inflate(R.layout.fragment_upload_election_details, container, false)

        rootView.iv_start_date.setOnClickListener {
            val newFragment: DialogFragment = DatePickerFragment()
            newFragment.show(requireActivity().supportFragmentManager, "datePicker")
        }

        rootView.iv_end_date.setOnClickListener {
            val newFragment: DialogFragment = DatePickerFragment()
            newFragment.show(requireActivity().supportFragmentManager, "datePicker")
        }

        rootView.btn_proceed.setOnClickListener {
            parentFragment?.findNavController()?.navigate(R.id.uploadCandidateFragment)
        }

        algorithms = ArrayList()
        algorithmsAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, algorithms)
        algorithmsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        rootView.spinner_algorithm.setAdapter(algorithmsAdapter)
        fillAlgorithms()

        rootView.iv_info.setOnClickListener {
            val alertDialog =  AlertDialog.Builder(requireContext())
                .setTitle(getString(R.string.information))
                .setMessage(getString(R.string.lorem_ipsum_dolor_sit_amet_consectetur_adipiscing_elit_ut_aliquam))
                .setPositiveButton(getString(R.string.ok),DialogInterface.OnClickListener { dialog, which ->
                    dialog.dismiss()
                })
                .create()
            alertDialog.show()
        }
        return rootView
    }

    class DatePickerFragment : DialogFragment(), OnDateSetListener {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            val c: Calendar = Calendar.getInstance()
            val year: Int = c.get(Calendar.YEAR)
            val month: Int = c.get(Calendar.MONTH)
            val day: Int = c.get(Calendar.DAY_OF_MONTH)
            return DatePickerDialog(
                requireActivity(),
                R.style.DatePickerDialogTheme,
                this,
                year,
                month,
                day
            )
        }

        override fun onDateSet(
            view: DatePicker,
            year: Int,
            month: Int,
            day: Int
        ) {
        }
    }

    private fun fillAlgorithms(){
        algorithms.add("")
        algorithms.add("Oklahoma")
        algorithms.add("Range Voting")
        algorithms.add("Ranked Pairs")
        algorithmsAdapter.notifyDataSetChanged()

    }


}
