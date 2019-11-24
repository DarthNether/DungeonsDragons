package com.example.dungeonsdragons.views.ui.races

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Race
import kotlinx.android.synthetic.main.item_race.view.*

class RacesAdapter(private val itemClickListener: (Race) -> Unit) :
    RecyclerView.Adapter<RacesAdapter.RacesViewHolder>() {
    var races: Array<Race> = arrayOf()

    class RacesViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun getItemCount(): Int = races.size

    override fun onBindViewHolder(holder: RacesViewHolder, position: Int) =
        with(holder.itemView) {
            races[position].let {
                txt_race.text = it.name
                img_race.setImageDrawable(ContextCompat.getDrawable(context, it.icon))
                setOnClickListener { _ -> itemClickListener(it) }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        RacesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_race,
                parent,
                false
            )
        )
}