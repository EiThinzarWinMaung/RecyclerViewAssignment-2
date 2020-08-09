package com.example.recyclerviewassignment_2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment_2.R
import com.example.recyclerviewassignment_2.adapter.BestSellingAdapter
import com.example.recyclerviewassignment_2.model.BestSelling
import com.example.recyclerviewassignment_2.model.Trending
import kotlinx.android.synthetic.main.fragment_best_selling.*

class BestSellingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_best_selling, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var bestsellingList = ArrayList<BestSelling>()
        bestsellingList.add(BestSelling(R.drawable.ruffle_trim,"Ruffle Trim Spot Wrap Dress","$29.00"))
        bestsellingList.add(BestSelling(R.drawable.leaf_floral_print,"Leaf Floral Print Random","$29.00"))
        bestsellingList.add(BestSelling(R.drawable.drop_shoulder_geo,"Drop Shoulder Geo Pattern","$29.00"))
        bestsellingList.add(BestSelling(R.drawable.pattern_buckle,"Snakeskin Pattern Buckle","$29.00"))
        bestsellingList.add(BestSelling(R.drawable.armchair_konna_green,"Armchair Konna, green","$29.00"))

        BestSellingRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = BestSellingAdapter(bestsellingList)
        }
    }
}