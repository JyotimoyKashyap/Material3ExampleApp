package com.jyotimoykashyap.demoresourcehub

import androidx.recyclerview.widget.DiffUtil

class CustomDiffUtil : DiffUtil.ItemCallback<Gdsc>() {
    override fun areItemsTheSame(oldItem: Gdsc, newItem: Gdsc): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Gdsc, newItem: Gdsc): Boolean {
        return oldItem.name == newItem.name && oldItem.description == newItem.description
    }

}