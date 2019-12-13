package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Character

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(vararg characters: Character)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacter(character: Character): Long

    @Update
    fun updateCharacters(vararg characters: Character)

    @Delete
    fun deleteCharacters(vararg characters: Character)

    @Query("SELECT * FROM characters_table")
    suspend fun loadAllCharacters(): Array<Character>

    @Query("SELECT * FROM characters_table WHERE id = :id")
    fun loadCharacterById(id: Int): Array<Character>

    @Query("SELECT COUNT(*) FROM characters_table")
    suspend fun getCount(): Int
}