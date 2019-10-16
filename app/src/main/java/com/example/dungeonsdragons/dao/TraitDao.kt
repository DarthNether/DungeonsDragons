package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Trait

@Dao
interface TraitDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTraits(vararg traits: Trait)

    @Update
    fun updateTraits(vararg trait: Trait)

    @Delete
    fun deleteTraits(vararg trait: Trait)

    @Query("SELECT * FROM traits_table")
    fun loadAllTraits(): Array<Trait>

    @Query("SELECT * FROM traits_table WHERE id = :id")
    fun loadTraitById(id: Int): Array<Trait>

    @Query("SELECT * FROM traits_table WHERE name LIKE :name")
    fun loadTraitByName(name: String): Array<Trait>

    @Query("SELECT * FROM traits_table WHERE subrace LIKE :subrace")
    fun loadTraitsBySubrace(subrace: Int): Array<Trait>

    @Query("SELECT * FROM traits_table WHERE race LIKE :race")
    fun loadTraitsByRace(race: Int): Array<Trait>
}