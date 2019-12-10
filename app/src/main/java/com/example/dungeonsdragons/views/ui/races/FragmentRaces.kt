package com.example.dungeonsdragons.views.ui.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.viewmodels.CharactersViewModel
import com.example.dungeonsdragons.viewmodels.RacesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_races.*

class FragmentRaces : Fragment() {
    private val charactersViewModel by activityViewModels<CharactersViewModel>()
    private val racesViewModel by activityViewModels<RacesViewModel>()
    private val racesAdapter by lazy { RacesAdapter(::selectRaceAndNavigateToDetails) }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        races_recycler.run {
            adapter = racesAdapter
            layoutManager = LinearLayoutManager(context)
        }
        racesViewModel.races.observe(viewLifecycleOwner,
            Observer {
                activity?.fab?.hide()
                racesAdapter.races = it
                racesAdapter.notifyDataSetChanged()
            })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_races, container, false)
    }

    fun selectRaceAndNavigateToDetails(race: Race) {
        val args: FragmentRacesArgs by navArgs<FragmentRacesArgs>()

        if (args.creatingCharacter) {
            charactersViewModel.selectedCharacter.value?.race = race.id

            val action = FragmentRacesDirections.chooseClass()
            findNavController().navigate(action)
        } else {
            racesViewModel.selectedRace.value = race
            findNavController().navigate(R.id.get_race_specs)
        }
    }
}
