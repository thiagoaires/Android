package com.thiagoas.listmaker.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiagoas.listmaker.R

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val listPosition: TextView = itemView.findViewById(R.id.tvItemNumber)
    val listTitle: TextView = itemView.findViewById(R.id.tvItemString)

}