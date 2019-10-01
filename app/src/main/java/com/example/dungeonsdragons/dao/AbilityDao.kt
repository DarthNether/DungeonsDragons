package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Ability

@Dao
interface AbilityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAbilities(vararg ability: Ability)

    @Update
    fun updateAbilities(vararg ability: Ability)

    @Delete
    fun deleteAbilities(vararg ability: Ability)

    @Query("SELECT * FROM abilities_table")
    fun loadAllAbilities(): Array<Ability>

    @Query("SELECT * FROM abilities_table where id = :id")
    fun loadAbilityById(id: Int): Array<Ability>

    @Query("SELECT * FROM abilities_table where name LIKE :name")
    fun loadAbilityByName(name: String): Array<Ability>
}