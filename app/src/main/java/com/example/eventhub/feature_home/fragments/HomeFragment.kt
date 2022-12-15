package com.example.eventhub.feature_home.fragments

import android.annotation.SuppressLint
import android.content.res.Resources
import android.media.Image
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.SearchView
import androidx.compose.ui.graphics.Color
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eventhub.R
import com.example.eventhub.commons.BaseFragment
import com.example.eventhub.databinding.ActivityHomeBinding
import com.example.eventhub.feature_home.viewmodels.HomeViewModel
import java.text.DateFormat
import java.util.*
import com.example.eventhub.feature_home.viewmodels.HomeFragmentViewModel
import java.text.SimpleDateFormat

class HomeFragment : BaseFragment() {
    //recycleradapter
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private var bigadapter: RecyclerView.Adapter<BigRecyclerAdapter.ViewHolder>? = null
    private var secondbigadapter: RecyclerView.Adapter<SecondBigRecyclerAdapter.ViewHolder>? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerView3: RecyclerView
    private lateinit var recyclerView4: RecyclerView
    private lateinit var itemImage3: ImageView
    private lateinit var itemTitle3: TextView
    private lateinit var itemDate3: TextView
    private lateinit var itemTime3: TextView
    private lateinit var itemPartic3: TextView
    private lateinit var itemLoc3: TextView

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

        val calendar = Calendar.getInstance().time;
        val dateFormat = SimpleDateFormat("EEEE, dd MMM")
        val currentDate:String = dateFormat.format(calendar);

        val textViewDate: TextView = requireView().findViewById(R.id.currentToday);
        textViewDate.setText(currentDate)

        bindViews()
        initAdapter()

//        val searchView: SearchView = requireView().findViewById(R.id.searchView)
//        searchView.setQueryHintTextColor(Color.White)

        val organiseEvent: View = view.findViewById(R.id.organiseEventButton)
        organiseEvent.setOnClickListener{findNavController().navigate(R.id.action_homeFragment_to_OrganiseEventFragment)}

    }

    private fun initAdapter(){
        //recycleradapter(0)


        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

        //recycleradapter(2) NON IMPLEMENTED
//

//
//        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.layoutManager = layoutManager
//
//        adapter = RecyclerAdapter()
//        recyclerView.adapter = adapter

        //recycleradapter(3)

        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.layoutManager = layoutManager

        bigadapter = BigRecyclerAdapter()
        recyclerView3.adapter = bigadapter

        //recycleradapter(4)

        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView4.layoutManager = layoutManager

        secondbigadapter = SecondBigRecyclerAdapter()
        recyclerView4.adapter = secondbigadapter

    }

    private fun bindViews(){
        recyclerView= requireView().findViewById(R.id.recyclerView)
        //        recyclerView2= requireView().findViewById(R.id.recyclerView2);
        recyclerView3= requireView().findViewById(R.id.recyclerView3);
        recyclerView4= requireView().findViewById(R.id.recyclerView4);

        //eveniment recomandat
        itemImage3 = requireView().findViewById(R.id.item_image3)
        itemTitle3 = requireView().findViewById(R.id.item_title3)
        itemDate3= requireView().findViewById(R.id.item_date3)
        itemTime3= requireView().findViewById(R.id.item_time3)
        itemPartic3= requireView().findViewById(R.id.item_partic3)
        itemLoc3= requireView().findViewById(R.id.item_location3)

        itemImage3.setImageDrawable(resources.getDrawable(R.drawable.van_gogh_image,requireContext().theme))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

}
