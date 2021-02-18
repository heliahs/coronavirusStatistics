package com.hh.coronalastupdate.adapters

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hh.coronalastupdate.databinding.ListItemsLayoutBinding
import com.hh.coronalastupdate.models.Country


class MyListAdapter  (private val clickListener: MyAdapterDataListener) : ListAdapter<Country, MyListAdapter.ViewHolder>(MyDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(getItem(position)!!, clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: ListItemsLayoutBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: Country, clickListener: MyAdapterDataListener) {
            binding.country = item
            binding.clickListener = clickListener
            binding.executePendingBindings()

        }



        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListItemsLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}


class MyDiffCallback : DiffUtil.ItemCallback<Country>() {

    override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem.Country == newItem.Country
    }

    override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem == newItem
    }
}


class MyAdapterDataListener(val clickListener: (Country: Country) -> Unit) {
    fun onClick(country: Country) = clickListener(country)
}
