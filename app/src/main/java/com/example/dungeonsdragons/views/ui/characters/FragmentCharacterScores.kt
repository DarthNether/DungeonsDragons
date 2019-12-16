package com.example.dungeonsdragons.views.ui.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.utilities.intVal
import com.example.dungeonsdragons.viewmodels.AbilityScoresViewModel
import com.example.dungeonsdragons.viewmodels.CharactersViewModel
import com.example.dungeonsdragons.viewmodels.RacesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_character_scores.*
import kotlinx.coroutines.launch

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

        activity?.toolbar?.title = getString(R.string.abilities)

        txt_str.addTextChangedListener { _ -> calcStrengthValues() }
        txt_dex.addTextChangedListener { _ -> calcDexterityValues() }
        txt_con.addTextChangedListener { _ -> calcConstitutionValues() }
        txt_int.addTextChangedListener { _ -> calcIntelligenceValues() }
        txt_wis.addTextChangedListener { _ -> calcWisdomValues() }
        txt_cha.addTextChangedListener { _ -> calcCharismaValues() }

        btn_confirm_creation.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                confirmCreation()
            }
        }
    }

    private fun calcStrengthValues() {
        if (txt_str.text.toString() != "") {
            val strVal = txt_str.text.toString().toInt()

            txt_base_str_val.text = txt_str.text.toString()
            txt_mod_str_val.text = racesViewModel.selectedRace.value!!.str_bonus.toString()
            txt_total_str_val.text =
                (strVal + racesViewModel.selectedRace.value!!.str_bonus).toString()
        }
    }

    private fun calcDexterityValues() {
        if (txt_dex.text.toString() != "") {
            val dexVal = txt_dex.text.toString().toInt()

            txt_base_dex_val.text = txt_dex.text.toString()
            txt_mod_dex_val.text = racesViewModel.selectedRace.value!!.dex_bonus.toString()
            txt_total_dex_val.text =
                (dexVal + racesViewModel.selectedRace.value!!.dex_bonus).toString()
        }
    }

    private fun calcConstitutionValues() {
        if (txt_con.text.toString() != "") {
            val conVal = txt_con.text.toString().toInt()

            txt_base_con_val.text = txt_con.text.toString()
            txt_mod_con_val.text = racesViewModel.selectedRace.value!!.con_bonus.toString()
            txt_total_con_val.text =
                (conVal + racesViewModel.selectedRace.value!!.con_bonus).toString()
        }
    }

    private fun calcIntelligenceValues() {
        if (txt_int.text.toString() != "") {
            val intVal = txt_int.text.toString().toInt()

            txt_base_int_val.text = txt_int.text.toString()
            txt_mod_int_val.text = racesViewModel.selectedRace.value!!.int_bonus.toString()
            txt_total_int_val.text =
                (intVal + racesViewModel.selectedRace.value!!.int_bonus).toString()
        }
    }

    private fun calcWisdomValues() {
        if (txt_wis.text.toString() != "") {
            val wisVal = txt_wis.text.toString().toInt()

            txt_base_wis_val.text = txt_wis.text.toString()
            txt_mod_wis_val.text = racesViewModel.selectedRace.value!!.wis_bonus.toString()
            txt_total_wis_val.text =
                (wisVal + racesViewModel.selectedRace.value!!.wis_bonus).toString()
        }
    }

    private fun calcCharismaValues() {
        if (txt_cha.text.toString() != "") {
            val chaVal = txt_cha.text.toString().toInt()

            txt_base_cha_val.text = txt_cha.text.toString()
            txt_mod_cha_val.text = racesViewModel.selectedRace.value!!.cha_bonus.toString()
            txt_total_cha_val.text =
                (chaVal + racesViewModel.selectedRace.value!!.cha_bonus).toString()
        }
    }

    private suspend fun confirmCreation() {

        charactersViewModel.insertCharacter()

        abilityScoresViewModel.insertAbilityScores(
            txt_str.intVal,
            txt_dex.intVal,
            txt_con.intVal,
            txt_int.intVal,
            txt_wis.intVal,
            txt_cha.intVal,
            racesViewModel.selectedRace.value!!,
            charactersViewModel.insertId.value!!.toInt()
        )
        findNavController().navigate(R.id.return_to_characters)
    }
}

