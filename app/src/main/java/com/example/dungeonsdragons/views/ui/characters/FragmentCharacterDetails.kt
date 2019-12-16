package com.example.dungeonsdragons.views.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.utilities.observeFromView
import com.example.dungeonsdragons.viewmodels.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_character_details.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentCharacterDetails : Fragment() {
    private val characterViewModel by activityViewModels<CharactersViewModel>()
    private val raceViewModel by activityViewModels<RacesViewModel>()
    private val classesViewModel by activityViewModels<ClassesViewModel>()
    private val abilityScoresViewModel by activityViewModels<AbilityScoresViewModel>()
    private val skillsViewModel by activityViewModels<SkillsViewModel>()
    private val abilitiesViewModel by activityViewModels<AbilitiesViewModel>()

    var hitDie: Int = 0

    var observerSkillsSet = false
    var observerAbilitiesSet = false

    private val skillsAdapter by lazy { SkillsAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recycler_skills.run {
            adapter = skillsAdapter
            layoutManager = LinearLayoutManager(context)
        }

        characterViewModel.selectedCharacter.observe(viewLifecycleOwner, Observer { char ->
            char?.let {
                txt_char_name.text = char.char_name.toString()
                txt_alignment.text = char.alignment
                txt_appearance_desc.text = char.appearance
                txt_personality_desc.text = char.personality
                txt_background_desc.text = char.backstory

                activity?.toolbar?.title = char.char_name
                activity?.fab?.hide()

                raceViewModel.loadRaceById(it.race!!)

                classesViewModel.loadClassById(it.clazz!!)

                abilityScoresViewModel.loadAbilityScoresByCharacter(it.id)

                abilitiesViewModel.loadAbilities()

                skillsViewModel.loadSkills()
            }
        })

        observeFromView(raceViewModel.selectedRace) {
            txt_race.text = it.name
            txt_speed_val.text = it.speed.toString()
        }

        observeFromView(classesViewModel.selectedClass) {
            txt_class.text = it.name
            hitDie = it.hit_die
        }

        observeFromView(abilityScoresViewModel.abilityScores) { scores ->
            scores.forEach {
                val score = (it.bonus + it.score)

                var bonus = -5
                for (i in 2 until score step 2) {
                    bonus++
                }

                when (it.ability) {
                    0 -> {
                        txt_str_score.text = score.toString()
                        txt_str_mod.text = bonus.toString()
                    }
                    1 -> {
                        txt_dex_score.text = score.toString()
                        txt_dex_mod.text = bonus.toString()
                        txt_ac_val.text = (bonus + 10).toString()
                    }
                    2 -> {
                        txt_con_score.text = score.toString()
                        txt_con_mod.text = bonus.toString()
                        txt_hp_val.text = (hitDie + bonus).toString()
                    }
                    3 -> {
                        txt_int_score.text = score.toString()
                        txt_int_mod.text = bonus.toString()
                    }
                    4 -> {
                        txt_wis_score.text = score.toString()
                        txt_wis_mod.text = bonus.toString()
                    }
                    5 -> {
                        txt_cha_score.text = score.toString()
                        txt_cha_mod.text = bonus.toString()
                    }
                }


            }

            if (!observerSkillsSet) {
                observerSkillsSet = true
                observeFromView(skillsViewModel.skills) { skills ->
                    if (!observerAbilitiesSet) {
                        observerAbilitiesSet = true
                        observeFromView(abilitiesViewModel.abilities) { abilities ->
                            skillsViewModel.calcBonus(scores, abilities)
                        }
                    }
                }
            }
        }

        observeFromView(skillsViewModel.skillsWithBonus) {
            skillsAdapter.skills = it
            skillsAdapter.notifyDataSetChanged()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        characterViewModel.selectedCharacter.value = null
        abilityScoresViewModel.abilityScores.value = null
        skillsViewModel.skillsWithBonus.value = null
        observerAbilitiesSet = false
        observerSkillsSet = false
    }
}
