package com.example.a571k

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilterAdapter(var context: Context, var list: ArrayList<filter>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var EXPLORES = 0
    private var CONTENTS = 1

    override fun getItemViewType(position: Int): Int {

        return if (isHeader(position)) {
            EXPLORES
        } else {
            CONTENTS
        }
    }

    private fun isHeader(position: Int): Boolean {
        return position == 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == EXPLORES) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.explore, parent, false)
            return ExploreViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.content, parent, false)
        return ContentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val main = list[position]
        if (holder is ExploreViewHolder) {

        }
        if (holder is ContentsViewHolder) {
            holder.contents.text = main.title
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ExploreViewHolder(item: View) : RecyclerView.ViewHolder(item) {

    }

    inner class ContentsViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var contents: TextView = item.findViewById(R.id.contents_text_id)

    }
}