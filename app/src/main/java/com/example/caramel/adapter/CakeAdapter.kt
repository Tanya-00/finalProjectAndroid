package com.example.caramel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.R

class CakeAdapter(private val items: List<Triple<Int, String, String>>) :
        RecyclerView.Adapter<CakeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        var desc: TextView? = null
        var price: TextView? = null

        init {
            image = itemView.findViewById(R.id.cakeImg)
            desc = itemView.findViewById(R.id.descCake)
            price = itemView.findViewById(R.id.cakePrice)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CakeAdapter.ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rec_cake, parent, false)
        return CakeAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CakeAdapter.ViewHolder, position: Int) {
        holder.image?.setImageResource(items[position].first)
        holder.desc?.text = items[position].second
        holder.price?.text = items[position].third
    }

    override fun getItemCount() : Int {
        return items.size
    }
}