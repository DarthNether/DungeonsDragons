package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.ProficiencyBackground

@Dao
interface ProficiencyBackgroundDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProficiencyBackground(proficiencyBackground: ProficiencyBackground)

    @Query(
        """SELECT * FROM proficiencies_table
            INNER JOIN proficiencies_backgrounds_table ON proficiencies_table.id = proficiency
            WHERE background = :background"""
    )
    fun loadProficienciesFromBackground(background: Int)

    @Query(
        """SELECT * FROM backgrounds_table 
            INNER JOIN proficiencies_backgrounds_table ON backgrounds_table.id = background
            WHERE proficiency = :proficiency"""
    )
    fun loadBackgroundsFromProficiency(proficiency: Int)

}