package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.entitities.Trait
import com.example.dungeonsdragons.entitities.TraitRace

@Dao
interface TraitRaceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTraitRace(vararg traitRace: TraitRace)

    @Query(
        """SELECT * FROM traits_table 
            INNER JOIN traits_races_table ON traits_table.id = traits_races_table.trait
            WHERE traits_races_table.race = :race
        """
    )
    fun loadTraitsByRace(race: Int): Array<Trait>

    @Query(
        """SELECT * FROM races_table 
            INNER JOIN traits_races_table ON races_table.id = traits_races_table.race
            WHERE traits_races_table.trait = :trait
        """
    )
    fun loadRacesByTrait(trait: Int): Array<Race>
}