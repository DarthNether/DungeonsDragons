package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Condition

@Dao
interface ConditionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertConditions(vararg conditions: Condition)

    @Update
    fun updateConditions(vararg conditions: Condition)

    @Delete
    fun deleteConditions(vararg conditions: Condition)

    @Query("SELECT * FROM conditions_table")
    fun selectAllConditions(): Array<Condition>

    @Query("SELECT * FROM conditions_table WHERE `index` = :index")
    fun selectConditionByIndex(index: Int): Array<Condition>

    @Query("SELECT * FROM conditions_table WHERE name LIKE :name")
    fun selectConditionByName(name: String): Array<Condition>
}