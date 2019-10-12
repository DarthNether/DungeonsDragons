package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Proficiency

@Dao
interface ProficiencyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProficiencies(vararg proficiency: Proficiency)

    @Update
    fun updateProficiencies(vararg proficiency: Proficiency)

    @Delete
    fun deleteProficiencies(vararg proficiency: Proficiency)

    @Query("SELECT * FROM proficiencies_table ORDER BY type")
    fun loadAllProficiencies(): Array<Proficiency>

    @Query("SELECT * FROM proficiencies_table WHERE type LIKE :type")
    fun loadProficienciesByType(type: String): Array<Proficiency>
}