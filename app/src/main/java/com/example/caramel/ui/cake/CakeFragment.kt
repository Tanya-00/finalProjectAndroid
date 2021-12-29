package com.example.caramel.ui.cake

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
import com.example.caramel.adapter.CakeAdapter
import com.example.caramel.adapter.CustomRecyclerAdapter
import com.example.caramel.databinding.FragmentCakeBinding

class CakeFragment : Fragment() {

    private lateinit var cakeViewModel: CakeViewModel
    private var _binding: FragmentCakeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cakeViewModel =
            ViewModelProvider(this).get(CakeViewModel::class.java)

        _binding = FragmentCakeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.recCake
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = CakeAdapter(cakeViewModel.getCakesList())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}