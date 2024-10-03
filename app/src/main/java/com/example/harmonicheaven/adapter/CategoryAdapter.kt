package com.example.harmonicheaven.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.harmonicheaven.databinding.CategoryItemRecyclerRowBinding
import com.example.harmonicheaven.models.categoryModel

class CategoryAdapter (private val categoryList: List<categoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding : CategoryItemRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root){
            //binding the data with views
            fun bindData(category : categoryModel){
                binding.nameTextView.text = category.name
                Glide.with(binding.coverImageView).load(category.coverUrl).into(binding.coverImageView)

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = CategoryItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(categoryList[position])
    }

}