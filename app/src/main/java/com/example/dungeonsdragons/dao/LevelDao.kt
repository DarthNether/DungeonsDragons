package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Level

@Dao
interface LevelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLevels(vararg level: Level)

    @Update
    fun updateLevels(vararg level: Level)

    @Delete
    fun deleteLevels(vararg level: Level)

    @Query("SELECT * FROM levels_table")
    fun loadAllLevels(): Array<Level>

    @Query("SELECT * FROM levels_table WHERE level = :level")
    fun loadLevelsByLevel(level: Int): Array<Level>

    @Query("SELECT * FROM levels_table WHERE xp_points = :xp")
    fun loadLevelsByXP(xp: Int): Array<Level>
}