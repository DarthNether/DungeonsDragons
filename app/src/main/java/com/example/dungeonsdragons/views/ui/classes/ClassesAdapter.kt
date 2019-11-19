package com.example.dungeonsdragons.views.ui.classes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Class
import kotlinx.android.synthetic.main.item_class.view.*

class ClassesAdapter(private val ClassesDataset: Array<Class>) :
    RecyclerView.Adapter<ClassesAdapter.ClassesViewHolder>() {

    class ClassesViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun getItemCount(): Int = ClassesDataset.size

    override fun onBindViewHolder(holder: ClassesViewHolder, position: Int) =
        with(holder.itemView) {
            ClassesDataset[position].let {
                txtClass.text = it.name
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ClassesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_class,
                parent,
                false
            )
        )
}