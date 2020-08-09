package com.example.recyclerviewassignment_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.model.Trending
import kotlinx.android.synthetic.main.item_trending.view.*

class TrendingAdapter(var TrendingList: ArrayList<Trending>): RecyclerView.Adapter<TrendingAdapter.TrendingViewHolder>() {
    class TrendingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(trending: Trending) {
            itemView.txtTrendingName.text = trending.name
            itemView.txtTrendingPrice.text = trending.price
            itemView.imgTrendingImage.setImageResource(trending.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_trending,parent,false)
        return TrendingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return TrendingList.size
    }

    override fun onBindViewHolder(holder: TrendingViewHolder, position: Int) {
        return holder.bind(TrendingList[position])
    }
}