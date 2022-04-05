package com.example.teknologikesehatan

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListTeknologiAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<ListTeknologiAdapter.ListTeknologiViewHolder>(){
    class ListTeknologiViewHolder(view: View?): RecyclerView.ViewHolder(view!!){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListTeknologiViewHolder {
        return ListTeknologiViewHolder(null)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(
        holder: ListTeknologiViewHolder,
        position: Int
    ) {
        val resources = context?.resources
    }
}