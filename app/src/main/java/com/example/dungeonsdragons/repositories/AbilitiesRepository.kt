package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.AbilityDao

class AbilitiesRepository(private val abilityDao: AbilityDao) {
    suspend fun loadAbilities() = abilityDao.loadAllAbilities()

    companion object {
        @Volatile
        private var instance: AbilitiesRepository? = null

        fun getInstance(abilityDao: AbilityDao) =
            instance ?: synchronized(this) {
                instance ?: AbilitiesRepository(abilityDao).also { instance = it }
            }
    }
}