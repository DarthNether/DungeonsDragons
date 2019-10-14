package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Race

@Dao
interface RaceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRaces(vararg race: Race)

    @Update
    fun updateRaces(vararg race: Race)

    @Delete
    fun deleteRaces(vararg race: Race)

    @Query("SELECT * FROM races_table")
    fun loadAllRaces(): Array<Race>

    @Query("SELECT * FROM races_table WHERE id = :id")
    fun loadRaceById(id: Int): Array<Race>

    @Query("SELECT * FROM races_table WHERE name LIKE :name")
    fun loadRaceByName(name: String): Array<Race>
}