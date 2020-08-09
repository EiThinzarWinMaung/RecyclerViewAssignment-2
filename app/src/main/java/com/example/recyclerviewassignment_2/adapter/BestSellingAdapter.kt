package com.example.recyclerviewassignment_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.model.BestSelling
import kotlinx.android.synthetic.main.item_best_selling.view.*
import kotlinx.android.synthetic.main.item_trending.view.*

class BestSellingAdapter(var BestSellingList: ArrayList<BestSelling>): RecyclerView.Adapter<BestSellingAdapter.BestSellingViewHolder>() {
    class BestSellingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(bestSelling: BestSelling) {
            itemView.txtBestSellingName.text = bestSelling.name
            itemView.txtBestSellingPrice.text = bestSelling.price
            itemView.imgBestSellingImage.setImageResource(bestSelling.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellingViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_best_selling,parent,false)
        return BestSellingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return BestSellingList.size
    }

    override fun onBindViewHolder(holder: BestSellingViewHolder, position: Int) {
        return holder.bind(BestSellingList[position])
    }
}