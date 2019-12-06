package com.example.location_tracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CordinatesListAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<CordinatesListAdapter.CordinatesViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var cordinates = emptyList<Cordinates>() // Cached copy of words

    inner class CordinatesViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val CordinatesItemView: TextView = itemView.findViewById(R.id.textView_log)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CordinatesViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return CordinatesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CordinatesViewHolder, position: Int) {
        val current = cordinates[position]
        holder..text = cordinates
    }

    internal fun setCordinates(cordinates: List<Cordinates>) {
        this.cordinates = cordinates
        notifyDataSetChanged()
    }

    override fun getItemCount() = cordinates.size
}