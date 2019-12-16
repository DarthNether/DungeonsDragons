package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.classes.SkillWithBonus
import com.example.dungeonsdragons.entitities.Ability
import com.example.dungeonsdragons.entitities.AbilityScore
import com.example.dungeonsdragons.entitities.Skill
import com.example.dungeonsdragons.utilities.InjectionUtils.getSkillsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SkillsViewModel(app: Application) : AndroidViewModel(app) {
    private val skillsRepository = getSkillsRepository(app)
    val skills = MutableLiveData<Array<Skill>>()
    val skillsWithBonus = MutableLiveData<Array<SkillWithBonus>>()

    init {
        loadSkills()
    }

    fun loadSkills() {
        viewModelScope.launch { skills.value = skillsRepository.loadAllSkills() }
    }

    fun calcBonus(abilityScores: Array<AbilityScore>, abilities: Array<Ability>) {
        viewModelScope.launch {
            skillsWithBonus.value = withContext(Dispatchers.Default) {
                skills.value?.map { skill ->
                    val ability = abilities.first { skill.ability == it.id }
                    val abilityScore = abilityScores.first { skill.ability == it.ability }
                    val score = abilityScore.score + abilityScore.bonus

                    var bonus = -5
                    for (i in 2 until score step 2) {
                        bonus++
                    }

                    SkillWithBonus(ability.name, skill.name, bonus)
                }?.toTypedArray()
            }
        }
    }
}