package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Character

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCharacters(vararg characters: Character)

    @Update
    fun updateCharacters(vararg characters: Character)

    @Delete
    fun deleteCharacters(vararg characters: Character)

    @Query("SELECT * FROM characters_table")
    fun loadAllCharacters(): Array<Character>

    @Query("SELECT * FROM characters_table WHERE id = :id")
    fun loadCharacterById(id: Int): Array<Character>
}