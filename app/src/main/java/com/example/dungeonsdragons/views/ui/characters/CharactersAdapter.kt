package com.example.dungeonsdragons.views.ui.characters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Character
import kotlinx.android.synthetic.main.item_character.view.*

class CharactersAdapter(private val itemClickListener: (Character) -> Unit) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {
    var characters: Array<Character> = arrayOf()

    class CharactersViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder =
        CharactersViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_character,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) =
        with(holder.itemView) {
            characters[position].let {
                txt_character.text = it.char_name
            }
        }
}