package com.example.recyclerviewassignment_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.model.Discover
import kotlinx.android.synthetic.main.item_discover.view.*

class DiscoverAdapter(var DiscoverList: ArrayList<Discover>): RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder>() {
    class DiscoverViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(discover: Discover) {
            itemView.txtDiscoverName.text = discover.name
            itemView.txtDiscoverItem.text = discover.item
            itemView.imgDiscoverImage.setImageResource(discover.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_discover,parent,false)
        return DiscoverViewHolder(view)
    }

    override fun getItemCount(): Int {
        return DiscoverList.size
    }

    override fun onBindViewHolder(holder: DiscoverViewHolder, position: Int) {
        return holder.bind(DiscoverList[position])
    }
}