package com.thiagoas.listmaker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiagoas.listmaker.R

class ListSelectionRecyclerViewAdapter(listTitles: Array<String>) : RecyclerView.Adapter<ListSelectionRecyclerViewAdapter.ListSelectionViewHolder>(){

    var listTitles: Array<String>

    init {
        this.listTitles = listTitles
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listTitles.get(position)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder, parent,false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listTitles.size
    }

    inner class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val listPosition: TextView = itemView.findViewById(R.id.tvItemNumber)
        val listTitle: TextView = itemView.findViewById(R.id.tvItemString)

    }
}