package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Background
import com.example.dungeonsdragons.entitities.Proficiency
import com.example.dungeonsdragons.entitities.ProficiencyBackground

@Dao
interface ProficiencyBackgroundDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProficiencyBackground(proficiencyBackground: ProficiencyBackground)

    @Query(
        """SELECT * FROM proficiencies_table 
            INNER JOIN proficiencies_backgrounds_table ON proficiencies_table.id = proficiencies_backgrounds_table.proficiency 
            WHERE proficiencies_backgrounds_table.background = :background"""
    )
    fun loadProficienciesFromBackground(background: Int): Array<Proficiency>

    @Query(
        """SELECT * FROM backgrounds_table 
            INNER JOIN proficiencies_backgrounds_table ON proficiencies_backgrounds_table.backgrounds_table.id = background 
            WHERE proficiencies_backgrounds_table.proficiency = :proficiency"""
    )
    fun loadBackgroundsFromProficiency(proficiency: Int): Array<Background>

}