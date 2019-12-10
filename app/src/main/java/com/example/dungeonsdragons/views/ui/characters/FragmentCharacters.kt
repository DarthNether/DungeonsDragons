package com.example.dungeonsdragons.views.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Character
import com.example.dungeonsdragons.viewmodels.CharactersViewModel
import kotlinx.android.synthetic.main.app_bar_main.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class fragment_characters : Fragment() {
    private val charactersViewModel by activityViewModels<CharactersViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        charactersViewModel.characters.observe(viewLifecycleOwner,
            Observer {
                activity?.fab?.show()
                activity?.fab?.setOnClickListener {
                    charactersViewModel.selectedCharacter.value =
                        Character(
                            0,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null
                        )

                    findNavController().navigate(R.id.create_character)
                }
            })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_characters, container, false)
    }
}
