package com.android.performance.viewpager2demo

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Author: lidy
 * Project: ViewPager2Demo
 * TIME: 2019/2/23
 * Description:
 */
class SampleAdapter : RecyclerView.Adapter<SampleAdapter.SamplerHolder>() {

    var list = mutableListOf<String>()
    private val color = mutableListOf("#00574B", "#008577", "#D81B60")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SamplerHolder {
        return SamplerHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: SamplerHolder, position: Int) {
        holder.textView.text = "Sample_" + list[position]
        holder.linearLayout.setBackgroundColor(Color.parseColor(color[position]))
    }


    inner class SamplerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.text)
        var linearLayout: LinearLayout = itemView.findViewById(R.id.linear_layout)

    }

}