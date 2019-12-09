package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.CharacterDao

class CharactersRepository(private val charactersDao: CharacterDao) {
    suspend fun getAllCharacters() = charactersDao.loadAllCharacters()

    companion object {
        @Volatile
        private var instance: CharactersRepository? = null

        fun getInstance(charactersDao: CharacterDao) =
            instance ?: synchronized(this) {
                instance ?: CharactersRepository(charactersDao).also { instance = it }
            }
    }
}