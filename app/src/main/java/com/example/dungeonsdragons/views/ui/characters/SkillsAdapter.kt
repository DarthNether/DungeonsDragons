package com.example.dungeonsdragons.views.ui.characters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.classes.SkillWithBonus
import kotlinx.android.synthetic.main.item_skill.view.*

class SkillsAdapter : RecyclerView.Adapter<SkillsAdapter.SkillViewHolder>() {
    var skills: Array<SkillWithBonus> = arrayOf()

    class SkillViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder =
        SkillViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_skill,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = skills.size

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) =
        with(holder.itemView) {
            skills[position].let {
                txt_skill.text = it.skill
                txt_ability.text = it.mod
                txt_mod.text = it.bonus.toString()
            }
        }
}