package com.example.caramel.ui.buns

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
import com.example.caramel.R
import com.example.caramel.adapter.BunsAdapter
import com.example.caramel.databinding.FragmentBunsBinding

class BunsFragment : Fragment() {

    private lateinit var bunsViewModel: BunsViewModel
    private var _binding: FragmentBunsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bunsViewModel =
            ViewModelProvider(this).get(BunsViewModel::class.java)

        _binding = FragmentBunsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView : RecyclerView = binding.recBuns
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = BunsAdapter(bunsViewModel.getBunsList())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}