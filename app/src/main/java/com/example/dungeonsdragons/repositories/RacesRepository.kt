package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.RaceDao

class RacesRepository(private val racesDao: RaceDao) {
    suspend fun getAllRaces() = racesDao.loadAllRaces()
    suspend fun getRaceById(id: Int) = racesDao.loadRaceById(id)

    companion object {
        @Volatile
        private var instance: RacesRepository? = null

        fun getInstance(racesDao: RaceDao) =
            instance ?: synchronized(this) {
                instance ?: RacesRepository(racesDao).also { instance = it }
            }
    }
}