package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Language

@Dao
interface LanguageDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLanguages(vararg language: Language)

    @Update
    fun updateLanguages(vararg language: Language)

    @Delete
    fun deleteLanguages(vararg language: Language)

    @Query("SELECT * FROM languages_table")
    fun loadAllLanguages(): Array<Language>

    @Query("SELECT * FROM languages_table WHERE id = :id")
    fun loadLanguagesById(id: Int): Array<Language>

    @Query("SELECT * FROM languages_table WHERE name LIKE :name")
    fun loadLanguagesByName(name: String): Array<Language>

    @Query("SELECT * FROM languages_table WHERE script LIKE :script")
    fun loadLanguagesByScript(script: String): Array<Language>

    @Query("SELECT * FROM languages_table WHERE type LIKE :type")
    fun loadLanguagesByType(type: String): Array<Language>

    @Query("SELECT * FROM languages_table WHERE typical_speakers LIKE :speaker")
    fun loadLanguagesBySpeaker(speaker: String): Array<Language>
}