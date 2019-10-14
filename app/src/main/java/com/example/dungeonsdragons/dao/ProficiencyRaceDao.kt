package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Proficiency
import com.example.dungeonsdragons.entitities.ProficiencyRace
import com.example.dungeonsdragons.entitities.Race

@Dao
interface ProficiencyRaceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProficiencyRace(vararg proficiencyRace: ProficiencyRace)

    @Query(
        """ SELECT * FROM proficiencies_table 
        INNER JOIN proficiencies_races_table ON proficiencies_table.id = proficiencies_races_table.proficiency 
        WHERE proficiencies_races_table.race = :race
    """
    )
    fun loadProficienciesByRace(race: Int): Array<Proficiency>

    @Query(
        """ SELECT * FROM races_table  
        INNER JOIN proficiencies_races_table ON races_table.id = proficiencies_races_table.race 
        WHERE proficiencies_races_table.proficiency = :proficiency
    """
    )
    fun loadRacesByProficiency(proficiency: Int): Array<Race>
}