package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.AbilityScore
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.utilities.InjectionUtils.getAbilityScoresRepository
import kotlinx.coroutines.launch

class AbilityScoresViewModel(app: Application) : AndroidViewModel(app) {
    private val abilityScoresRepository = getAbilityScoresRepository(app.applicationContext)

    var abilityScores = MutableLiveData<Array<AbilityScore>>()


    suspend fun insertAbilityScores(
        str: Int,
        dex: Int,
        con: Int,
        int: Int,
        wis: Int,
        cha: Int,
        race: Race,
        id: Int
    ) {
        val abilityScores = arrayOf(
            AbilityScore(
                0,
                id,
                0,
                str,
                race.str_bonus
            ),
            AbilityScore(
                0,
                id,
                1,
                dex,
                race.dex_bonus
            ),
            AbilityScore(
                0,
                id,
                2,
                con,
                race.con_bonus
            ),
            AbilityScore(
                0,
                id,
                3,
                int,
                race.int_bonus
            ),
            AbilityScore(
                0,
                id,
                4,
                wis,
                race.wis_bonus
            ),
            AbilityScore(
                0,
                id,
                5,
                cha,
                race.cha_bonus
            )
        )

        abilityScoresRepository.insertAbilityScores(*abilityScores)
    }

    fun loadAbilityScoresByCharacter(char: Int) {
        viewModelScope.launch {
            abilityScores.value = abilityScoresRepository.loadAbilityScoresByCharacter(char)
        }
    }
}