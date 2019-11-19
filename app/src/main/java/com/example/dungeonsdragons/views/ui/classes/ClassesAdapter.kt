package com.example.dungeonsdragons.views.ui.classes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Class
import kotlinx.android.synthetic.main.item_class.view.*

class ClassesAdapter :
    RecyclerView.Adapter<ClassesAdapter.ClassesViewHolder>() {
    var classes: Array<Class> = arrayOf()
    class ClassesViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun getItemCount(): Int = classes.size

    override fun onBindViewHolder(holder: ClassesViewHolder, position: Int) =
        with(holder.itemView) {
            classes[position].let {
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