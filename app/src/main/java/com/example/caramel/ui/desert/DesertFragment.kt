package com.example.caramel.ui.desert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.adapter.CustomRecyclerAdapter
import com.example.caramel.adapter.DesertAdapter
import com.example.caramel.databinding.FragmentDesertBinding

class DesertFragment : Fragment() {

    private lateinit var desertViewModel: DesertViewModel
    private var _binding: FragmentDesertBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        desertViewModel =
            ViewModelProvider(this).get(DesertViewModel::class.java)

        _binding = FragmentDesertBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.recDesert
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = DesertAdapter(desertViewModel.getDesertsList())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}