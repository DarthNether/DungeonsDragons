package com.example.dungeonsdragons.views.ui.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.viewmodels.RacesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_races.*

class FragmentRaces : Fragment() {
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
        racesViewModel.selectedRace.value = race
        findNavController().navigate(R.id.get_race_specs)
    }
}
