package com.martinchamarro.android.playground.spacex.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.martinchamarro.android.playground.R
import com.martinchamarro.android.playground.spacex.domain.model.Launch

class LaunchesAdapter : ListAdapter<Launch, LaunchViewHolder>(LaunchDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_launch, parent, false)
        return LaunchViewHolder(view)
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        holder.nameView.text = getItem(position).name
    }

}

class LaunchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameView: TextView = view.findViewById(R.id.launch_name)
}

object LaunchDiffUtil : DiffUtil.ItemCallback<Launch>() {
    override fun areItemsTheSame(oldItem: Launch, newItem: Launch): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Launch, newItem: Launch): Boolean {
        return oldItem.name == newItem.name
    }
}
