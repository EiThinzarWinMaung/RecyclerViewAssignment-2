package com.example.recyclerviewassignment_2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.adapter.CollectionAdapter
import com.example.recyclerviewassignment_2.model.Collection
import kotlinx.android.synthetic.main.fragment_collection.*

class CollectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var collectionList = ArrayList<Collection>()
        collectionList.add(Collection(R.drawable.collection_2,"New Arrivals","Winter"))
        collectionList.add(Collection(R.drawable.collection_3,"New Arrivals","Summer"))
        collectionList.add(Collection(R.drawable.collection_1,"New Arrivals","Spring"))

        CollectionRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
            adapter = CollectionAdapter(collectionList)
        }
    }
}