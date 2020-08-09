package com.example.recyclerviewassignment_2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.adapter.DiscoverAdapter
import com.example.recyclerviewassignment_2.model.Discover
import kotlinx.android.synthetic.main.fragment_discover.*

class DiscoverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var discoverList = ArrayList<Discover>()
        discoverList.add(Discover(R.drawable.chair,"Chairs","1126 items"))
        discoverList.add(Discover(R.drawable.table,"Tables","442 items"))
        discoverList.add(Discover(R.drawable.single_sofa,"Sofa","784 items"))
        discoverList.add(Discover(R.drawable.cabinet,"Cabinets","960 items"))
        discoverList.add(Discover(R.drawable.lamp,"Lamps","1805 items"))
        discoverList.add(Discover(R.drawable.bed,"Beds","231 items"))
        discoverList.add(Discover(R.drawable.sofa_pillow,"Pillows","546 items"))
        discoverList.add(Discover(R.drawable.desk,"Desks","982 items"))
        discoverList.add(Discover(R.drawable.shelf,"Shelves","2160 items"))

        DiscoverRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = DiscoverAdapter(discoverList)
        }
    }
}