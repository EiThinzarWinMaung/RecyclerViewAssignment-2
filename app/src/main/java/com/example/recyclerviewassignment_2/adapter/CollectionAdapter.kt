package com.example.recyclerviewassignment_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.model.Collection
import kotlinx.android.synthetic.main.item_collection.view.*

class CollectionAdapter(var CollectionList: ArrayList<Collection>):RecyclerView.Adapter<CollectionAdapter.CollectionViewHolder>() {
    class CollectionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(collection: Collection) {
            itemView.txtCollectionName1.text = collection.name1
            itemView.txtCollectionName2.text = collection.name2
            itemView.imgCollection.setBackgroundResource(collection.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_collection,parent,false)
        return CollectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CollectionList.size
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        return holder.bind(CollectionList[position])
    }
}