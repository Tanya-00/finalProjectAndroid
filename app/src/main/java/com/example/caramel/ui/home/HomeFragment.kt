package com.example.caramel.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.Observer
import com.example.caramel.R
import com.example.caramel.adapter.AdapterHomeMenu
import com.example.caramel.adapter.CustomRecyclerAdapter
import com.example.caramel.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textViewNameCon: TextView = binding.nameCon

        homeViewModel.nameCon.observe(viewLifecycleOwner, Observer {
            textViewNameCon.text = it
        })

        val recyclerView: RecyclerView = binding.recMenu
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = CustomRecyclerAdapter(homeViewModel.getItemsList())

        val recyclerView2: RecyclerView = binding.osnRecMenu
        recyclerView2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView2.adapter = AdapterHomeMenu(homeViewModel.getHomeList())

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}