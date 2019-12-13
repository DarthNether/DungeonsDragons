package com.example.dungeonsdragons.views.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.AbilityScore
import com.example.dungeonsdragons.viewmodels.AbilityScoresViewModel
import com.example.dungeonsdragons.viewmodels.CharactersViewModel
import com.example.dungeonsdragons.viewmodels.RacesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_character_scores.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentCharacterScores : Fragment() {
    private val charactersViewModel by activityViewModels<CharactersViewModel>()
    private val racesViewModel by activityViewModels<RacesViewModel>()
    private val abilityScoresViewModel by activityViewModels<AbilityScoresViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_scores, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.toolbar?.title = getString(R.string.scores)

        txt_str.addTextChangedListener { _ -> calcStrengthValues() }
        txt_dex.addTextChangedListener { _ -> calcDexterityValues() }
        txt_con.addTextChangedListener { _ -> calcConstitutionValues() }
        txt_int.addTextChangedListener { _ -> calcIntelligenceValues() }
        txt_wis.addTextChangedListener { _ -> calcWisdomValues() }
        txt_cha.addTextChangedListener { _ -> calcCharismaValues() }

        btn_confirm_creation.setOnClickListener { _ -> confirmCreation() }
    }

    fun calcStrengthValues() {
        if (!txt_str.text.toString().equals("")) {
            val str_val = txt_str.text.toString().toInt()

            txt_base_str_val.text = txt_str.text.toString()
            txt_mod_str_val.text = racesViewModel.selectedRace.value!!.str_bonus.toString()
            txt_total_str_val.text =
                (str_val + racesViewModel.selectedRace.value!!.str_bonus).toString()
        }
    }

    fun calcDexterityValues() {
        if (!txt_dex.text.toString().equals("")) {
            val dex_val = txt_dex.text.toString().toInt()

            txt_base_dex_val.text = txt_dex.text.toString()
            txt_mod_dex_val.text = racesViewModel.selectedRace.value!!.dex_bonus.toString()
            txt_total_dex_val.text =
                (dex_val + racesViewModel.selectedRace.value!!.dex_bonus).toString()
        }
    }

    fun calcConstitutionValues() {
        if (!txt_con.text.toString().equals("")) {
            val con_val = txt_con.text.toString().toInt()

            txt_base_con_val.text = txt_con.text.toString()
            txt_mod_con_val.text = racesViewModel.selectedRace.value!!.con_bonus.toString()
            txt_total_con_val.text =
                (con_val + racesViewModel.selectedRace.value!!.con_bonus).toString()
        }
    }

    fun calcIntelligenceValues() {
        if (!txt_int.text.toString().equals("")) {
            val int_val = txt_int.text.toString().toInt()

            txt_base_int_val.text = txt_int.text.toString()
            txt_mod_int_val.text = racesViewModel.selectedRace.value!!.int_bonus.toString()
            txt_total_int_val.text =
                (int_val + racesViewModel.selectedRace.value!!.int_bonus).toString()
        }
    }

    fun calcWisdomValues() {
        if (!txt_wis.text.toString().equals("")) {
            val wis_val = txt_wis.text.toString().toInt()

            txt_base_wis_val.text = txt_wis.text.toString()
            txt_mod_wis_val.text = racesViewModel.selectedRace.value!!.wis_bonus.toString()
            txt_total_wis_val.text =
                (wis_val + racesViewModel.selectedRace.value!!.wis_bonus).toString()
        }
    }

    fun calcCharismaValues() {
        if (!txt_cha.text.toString().equals("")) {
            val cha_val = txt_cha.text.toString().toInt()

            txt_base_cha_val.text = txt_cha.text.toString()
            txt_mod_cha_val.text = racesViewModel.selectedRace.value!!.cha_bonus.toString()
            txt_total_cha_val.text =
                (cha_val + racesViewModel.selectedRace.value!!.cha_bonus).toString()
        }
    }

    fun confirmCreation() {
        charactersViewModel.insertCharacter(charactersViewModel.selectedCharacter.value!!)

        val abilityScores = arrayOf(
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                0,
                txt_str.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.str_bonus
            ),
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                1,
                txt_dex.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.dex_bonus
            ),
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                2,
                txt_con.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.con_bonus
            ),
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                3,
                txt_int.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.int_bonus
            ),
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                4,
                txt_wis.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.wis_bonus
            ),
            AbilityScore(
                0,
                charactersViewModel.insertId.value!!.toInt(),
                5,
                txt_cha.text.toString().toInt(),
                racesViewModel.selectedRace.value!!.cha_bonus
            )
        )
        abilityScoresViewModel.insertAbilityScores(*abilityScores)
    }
}
