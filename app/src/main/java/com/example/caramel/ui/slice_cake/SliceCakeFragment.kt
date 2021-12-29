package com.example.caramel.ui.slice_cake

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.R
import com.example.caramel.adapter.SliceCakeAdapter
import com.example.caramel.databinding.FragmentSliceCakeBinding

class SliceCakeFragment : Fragment() {

    private lateinit var sliceCakeViewModel: SliceCakeViewModel
    private var _binding: FragmentSliceCakeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sliceCakeViewModel =
            ViewModelProvider(this).get(SliceCakeViewModel::class.java)

        _binding = FragmentSliceCakeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView : RecyclerView = binding.recSliceCake
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = SliceCakeAdapter(sliceCakeViewModel.getSliceList())

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}