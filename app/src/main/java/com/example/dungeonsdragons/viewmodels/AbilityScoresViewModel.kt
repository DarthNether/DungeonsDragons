package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.AbilityScore
import com.example.dungeonsdragons.utilities.InjectionUtils.getAbilityScoresRepository
import kotlinx.coroutines.launch

class AbilityScoresViewModel(app: Application) : AndroidViewModel(app) {
    private val abilityScoresRepository = getAbilityScoresRepository(app.applicationContext)


    fun insertAbilityScores(vararg abilityScores: AbilityScore) {
        viewModelScope.launch { abilityScoresRepository.insertAbilityScores(*abilityScores) }
    }
}