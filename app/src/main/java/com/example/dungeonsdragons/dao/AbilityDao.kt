package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Ability

@Dao
interface AbilityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertAbilities(vararg abilities: Ability)

    @Update
    fun updateAbilities(vararg abilities: Ability)

    @Delete
    fun deleteAbilities(vararg ability: Ability)

    @Query("SELECT * FROM abilities_table")
    fun loadAllAbilities(): Array<Ability>

    @Query("SELECT * FROM abilities_table where `index` = :index")
    fun loadAbilityByIndex(index: Int): Array<Ability>

    @Query("SELECT * FROM abilities_table where name LIKE :name")
    fun loadAbilityByName(name: String): Array<Ability>
}