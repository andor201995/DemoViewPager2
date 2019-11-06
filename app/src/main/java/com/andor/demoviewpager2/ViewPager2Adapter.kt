package com.andor.demoviewpager2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(private val context: Context) :
    RecyclerView.Adapter<ViewPager2Adapter.ViewPagerHolder>() {
    lateinit var pageList: ArrayList<ViewPageData>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.item_listing, parent, false)
        return ViewPagerHolder(itemView)
    }

    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.contentTextView.text = pageList[position].content
    }


    inner class ViewPagerHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contentTextView: TextView = view.findViewById(R.id.content_txt_view)
    }
}