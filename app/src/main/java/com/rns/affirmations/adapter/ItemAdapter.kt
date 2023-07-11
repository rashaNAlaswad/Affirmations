package com.rns.affirmations.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rns.affirmations.databinding.ListItemBinding
import com.rns.affirmations.model.Affirmation

class ItemAdapter(private val dataSet: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ListItemBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemViewHolder(binding)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.itemTitle.text =
            holder.itemView.context.getString(dataSet[position].stringResourceId)
        holder.binding.itemImage.setImageResource(dataSet[position].imageResourceId)
    }
}