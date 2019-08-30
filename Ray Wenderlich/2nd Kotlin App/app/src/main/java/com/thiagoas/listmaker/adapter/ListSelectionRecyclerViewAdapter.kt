package com.thiagoas.listmaker.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiagoas.listmaker.R

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>(){

    var listTitles = arrayOf("tuto tooo", "tutti aoow", "androidTutorials")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_selection_view_holder, parent,false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listTitles.get(position)
    }
}