package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.AbilityScoreDao
import com.example.dungeonsdragons.entitities.AbilityScore

class AbilityScoresRepository(private val abilityScoreDao: AbilityScoreDao) {
    suspend fun insertAbilityScores(vararg abilityScore: AbilityScore) =
        abilityScoreDao.insertAbilityScores(*abilityScore)

    companion object {
        @Volatile
        private var instance: AbilityScoresRepository? = null

        fun getInstance(abilityScoreDao: AbilityScoreDao) =
            instance ?: synchronized(this) {
                instance ?: AbilityScoresRepository(abilityScoreDao).also { instance = it }
            }
    }
}