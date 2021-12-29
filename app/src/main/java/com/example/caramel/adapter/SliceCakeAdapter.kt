package com.example.caramel.adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.caramel.R

class SliceCakeAdapter(private val items: List<Triple<Int, String, String>>) :
    RecyclerView.Adapter<SliceCakeAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var image: ImageView? = null
            var desc: TextView? = null
            var price: TextView? = null

            init {
                image = itemView.findViewById(R.id.imgSliceCake)
                desc = itemView.findViewById(R.id.descSliceCake)
                price = itemView.findViewById(R.id.priceSliceCake)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliceCakeAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rec_slice_cake, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SliceCakeAdapter.ViewHolder, position: Int) {
        holder.image?.setImageResource(items[position].first)
        holder.desc?.text = items[position].second
        holder.price?.text = items[position].third
    }

    override fun getItemCount() : Int {
        return items.size
    }
}