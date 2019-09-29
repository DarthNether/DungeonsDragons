package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Background

@Dao
interface BackgroundDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertBackgrounds(vararg background: Background)

    @Update
    fun UpdateBackgrounds(vararg background: Background)

    @Delete
    fun DeleteBackgrounds(vararg background: Background)

    @Query("SELECT * FROM backgrounds_table")
    fun SelectAllBackgrounds(): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE `index` = :index")
    fun SelectBackgroundByIndex(index: Int): Array<Background>

    @Query("SELECT * FROM backgrounds_table WHERE name = :name")
    fun SelectBackgroundByName(name: String): Array<Background>
}