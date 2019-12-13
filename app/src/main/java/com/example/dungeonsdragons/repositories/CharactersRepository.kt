package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.CharacterDao
import com.example.dungeonsdragons.entitities.Character

class CharactersRepository(private val charactersDao: CharacterDao) {
    suspend fun getAllCharacters() = charactersDao.loadAllCharacters()
    suspend fun insertCharacter(character: Character) = charactersDao.insertCharacter(character)
    suspend fun getCount() = charactersDao.getCount()

    companion object {
        @Volatile
        private var instance: CharactersRepository? = null

        fun getInstance(charactersDao: CharacterDao) =
            instance ?: synchronized(this) {
                instance ?: CharactersRepository(charactersDao).also { instance = it }
            }
    }
}