package com.jyotimoykashyap.demoresourcehub

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jyotimoykashyap.demoresourcehub.databinding.RowItemBinding

class CustomAdapter(diffCallback : CustomDiffUtil)
    : ListAdapter<Gdsc, CustomAdapter.MyViewHolder>(diffCallback) {

        class MyViewHolder(val viewBinding: RowItemBinding)
            : RecyclerView.ViewHolder(viewBinding.root){
            fun bind(gdsc: Gdsc){
                viewBinding.run {
                    nameOfCollege.text = gdsc.name
                    descriptionOfCollege.text = gdsc.description

                    cardView.setOnLongClickListener{
                        cardView.isChecked = !cardView.isChecked
                        true
                    }
                }
            }

            companion object{
                fun from(parent : ViewGroup) : MyViewHolder{
                    val layoutInflater = LayoutInflater.from(parent.context)
                    val binding = RowItemBinding.inflate(layoutInflater, parent, false)
                    return MyViewHolder(binding)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }
}