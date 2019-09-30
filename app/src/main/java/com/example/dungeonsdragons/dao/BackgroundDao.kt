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
    fun selectAllBackgrounds(): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE `index` = :index")
    fun selectBackgroundByIndex(index: Int): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE name = :name")
    fun selectBackgroundByName(name: String): Array<Background>
}