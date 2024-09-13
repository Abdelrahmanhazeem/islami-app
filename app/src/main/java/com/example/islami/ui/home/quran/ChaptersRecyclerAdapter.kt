package com.example.islami.ui.home.quran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class ChaptersRecyclerAdapter(private val chapters: List<Chapter>) :
    RecyclerView.Adapter<ChaptersRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chapterName: TextView = itemView.findViewById(R.id.tv_chapter_name)
        val chapterPosition: TextView = itemView.findViewById(R.id.tv_chapter_position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chapter, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = chapters.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = chapters[position]
        holder.chapterName.text = item.name
        holder.chapterPosition.text = item.position.toString()
    }
}