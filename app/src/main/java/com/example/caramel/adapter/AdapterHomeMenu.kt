package com.example.caramel.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.R

class AdapterHomeMenu(private val items: List<Triple<Int, String, String>>) :
    RecyclerView.Adapter<AdapterHomeMenu.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        var desc: TextView? = null
        var price: TextView? = null

        init {
            image = itemView.findViewById(R.id.imageHomeMenu)
            desc = itemView.findViewById(R.id.descHome)
            price = itemView.findViewById(R.id.PriceHomeMenu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.design_home_menu, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterHomeMenu.ViewHolder, position: Int) {
        holder.image?.setImageResource(items[position].first)
        holder.desc?.text = items[position].second
        holder.price?.text = items[position].third
    }

    override fun getItemCount() : Int {
        return items.size
    }

}