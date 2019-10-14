package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Subrace

@Dao
interface SubraceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSubraces(vararg subrace: Subrace)

    @Update
    fun updateSubraces(vararg subrace: Subrace)

    @Delete
    fun deleteSubraces(vararg subrace: Subrace)

    @Query("SELECT * FROM subraces_table")
    fun loadAllSubraces(): Array<Subrace>

    @Query("SELECT * FROM subraces_table WHERE id = :id")
    fun loadSubraceById(id: Int): Array<Subrace>

    @Query("SELECT * FROM subraces_table WHERE name LIKE :name")
    fun loadSubraceByName(name: String): Array<Subrace>

    @Query("SELECT * FROM subraces_table WHERE race = :race")
    fun loadSubracesByRace(race: Int): Array<Subrace>
}