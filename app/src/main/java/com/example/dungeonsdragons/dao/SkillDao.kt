package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Skill

@Dao
interface SkillDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSkills(vararg skill: Skill)

    @Update
    fun updateSkills(vararg skill: Skill)

    @Delete
    fun deleteSkills(vararg skill: Skill)

    @Query("SELECT * FROM skills_table")
    suspend fun loadAllSkills(): Array<Skill>

    @Query("SELECT * FROM skills_table WHERE ability_id = :ability_id")
    fun loadSkillsByAbility(ability_id: Int): Array<Skill>
}