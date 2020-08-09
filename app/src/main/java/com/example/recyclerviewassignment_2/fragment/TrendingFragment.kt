package com.example.recyclerviewassignment_2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.adapter.TrendingAdapter
import com.example.recyclerviewassignment_2.model.BestSelling
import com.example.recyclerviewassignment_2.model.Trending
import kotlinx.android.synthetic.main.fragment_trending.*

class TrendingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var trendingList = ArrayList<Trending>()
        trendingList.add(Trending(R.drawable.ivonne_chair_green,"Ivonne chair, green","$29.00"))
        trendingList.add(Trending(R.drawable.pattern_buckle,"Snakeskin Pattern Buckle","$29.00"))
        trendingList.add(Trending(R.drawable.armchair_konna_green,"Armchair Konna, green","$29.00"))
        trendingList.add(Trending(R.drawable.leaf_floral_print,"Leaf Floral Print Random","$29.00"))
        trendingList.add(Trending(R.drawable.drop_shoulder_geo,"Drop Shoulder Geo Pattern","$29.00"))

        TrendingRecyclerView.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = TrendingAdapter(trendingList)
        }
    }
}