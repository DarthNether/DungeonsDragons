package com.example.dungeonsdragons.views.ui.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.viewmodels.RacesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_races_specs.*

class FragmentRacesSpecs : Fragment() {
    private val racesViewModel by activityViewModels<RacesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_races_specs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        racesViewModel.selectedRace.observe(viewLifecycleOwner,
            Observer {
                activity?.toolbar?.title = it.name
                txt_race_title.text = it.name
                txt_race_desc.text = it.desc
                txt_race_align_desc.text = it.align
                txt_race_age_desc.text = it.age
                txt_race_size_desc.text = it.size_desc
                img_race_pic.setImageDrawable(ContextCompat.getDrawable(requireContext(), it.pic))
            })
    }
}
