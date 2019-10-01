package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Background

@Dao
interface BackgroundDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBackgrounds(vararg background: Background)

    @Update
    fun updateBackgrounds(vararg background: Background)

    @Delete
    fun deleteBackgrounds(vararg background: Background)

    @Query("SELECT * FROM backgrounds_table")
    fun loadAllBackgrounds(): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE id = :id")
    fun loadBackgroundById(id: Int): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE name = :name")
    fun loadBackgroundByName(name: String): Array<Background>
}