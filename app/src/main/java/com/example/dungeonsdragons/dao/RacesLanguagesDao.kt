package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Language
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.entitities.RaceLanguage

@Dao
interface RacesLanguagesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRaceLanguage(vararg raceLanguage: RaceLanguage)

    @Query(
        """ SELECT * FROM races_table 
        INNER JOIN races_languages_table ON races_table.id = races_languages_table.race 
        WHERE races_languages_table.language = :language
    """
    )
    fun loadRacesByLanguages(language: Int): Array<Race>

    @Query(
        """ SELECT * FROM languages_table 
        INNER JOIN races_languages_table ON languages_table.id = races_languages_table.language
        WHERE races_languages_table.race = :race
    """
    )
    fun loadLanguagesByRace(race: Int): Array<Language>
}