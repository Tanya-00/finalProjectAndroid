package com.example.caramel.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.R
import android.content.Intent

class CustomRecyclerAdapter(private val items: List<String>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView? = null

        init {
            title = itemView.findViewById(R.id.fragmentTitle)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.design_fragmet, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title?.text = items[position]
    }

    override fun getItemCount() : Int {
        return items.size
    }

    class FragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var fragmentTitle: TextView

        init {
            fragmentTitle = itemView.findViewById(R.id.fragmentTitle)
        }
    }

}