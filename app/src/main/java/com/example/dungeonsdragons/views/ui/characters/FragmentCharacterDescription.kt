package com.example.dungeonsdragons.views.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Character
import com.example.dungeonsdragons.viewmodels.AlignmentsViewModel
import com.example.dungeonsdragons.viewmodels.CharactersViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_character_description.*


class FragmentCharacterDescription : Fragment() {
    private val charactersViewModel by activityViewModels<CharactersViewModel>()
    private val alignmentsViewModel by activityViewModels<AlignmentsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_description, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        alignmentsViewModel.alignments.observe(viewLifecycleOwner,
            Observer {
                val alignmentsAdapter =
                    ArrayAdapter<String>(context!!, R.layout.alignment_item, it.map { it.name })
                alignment_menu.setAdapter(alignmentsAdapter)
            })

        btn_to_race.setOnClickListener { _ -> navigateToRaceSelection() }
        activity?.fab?.hide()
        activity?.toolbar?.title = getString(R.string.desc)
    }

    private fun navigateToRaceSelection() {
        charactersViewModel.selectedCharacter.value =
            Character(
                0,
                txt_character_name.text.toString(),
                alignment_menu.text.toString(),
                txt_appearance.text.toString(),
                txt_personality.text.toString(),
                txt_backstory.text.toString(),
                null,
                null
            )

        val action = FragmentCharacterDescriptionDirections.chooseRace()
        findNavController().navigate(action)
    }
}
