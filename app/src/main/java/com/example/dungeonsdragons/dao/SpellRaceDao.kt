package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.entitities.Spell
import com.example.dungeonsdragons.entitities.SpellRace

@Dao
interface SpellRaceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSpellRace(vararg spellRace: SpellRace)

    @Query(
        """ SELECT * FROM spells_table 
        INNER JOIN spells_races_table ON spells_races_table.spell = spells_table.id 
        WHERE spells_races_table.race = :race
    """
    )
    fun loadSpellsByRace(race: Int): Array<Spell>

    @Query(
        """ SELECT * FROM races_table 
        INNER JOIN spells_races_table ON spells_races_table.race = races_table.id 
        WHERE spells_races_table.spell = :spell
    """
    )
    fun loadRacesBySpell(spell: Int): Array<Race>
}