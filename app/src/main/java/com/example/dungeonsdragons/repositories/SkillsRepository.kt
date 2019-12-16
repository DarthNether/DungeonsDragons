package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.SkillDao

class SkillsRepository(private val skillDao: SkillDao) {
    suspend fun loadAllSkills() = skillDao.loadAllSkills()

    companion object {
        @Volatile
        private var instance: SkillsRepository? = null

        fun getInstance(skillDao: SkillDao) =
            instance ?: synchronized(this) {
                instance ?: SkillsRepository(skillDao).also { instance = it }
            }
    }
}