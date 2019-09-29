package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Condition

@Dao
interface ConditionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertConditions(vararg conditions: Condition)

    @Update
    fun UpdateConditions(vararg conditions: Condition)

    @Delete
    fun DeleteConditions(vararg conditions: Condition)

    @Query("SELECT * FROM conditions_table")
    fun SelectAllConditions(): Array<Condition>

    @Query("SELECT * FROM conditions_table WHERE `index` = :index")
    fun SelectConditionByIndex(index: Int): Array<Condition>

    @Query("SELECT * FROM conditions_table WHERE name LIKE :name")
    fun SelectConditionByName(name: String): Array<Condition>
}