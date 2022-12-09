package com.example.eventhub.feature_home.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.eventhub.R
import com.example.eventhub.databinding.ActivityHomeBinding
import com.example.eventhub.feature_home.viewmodels.HomeViewModel
import java.text.DateFormat
import java.util.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calendar: Calendar = Calendar.getInstance();
        val currentDate:String = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        val textViewDate: TextView = requireView().findViewById(R.id.currentToday);
        textViewDate.setText(currentDate);

        val organiseEvent: View = view.findViewById(R.id.organiseEventButton)
        organiseEvent.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_OrganiseEventFragment)}

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

}
