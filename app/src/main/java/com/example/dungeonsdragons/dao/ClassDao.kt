package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Class

@Dao
interface ClassDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertClasses(vararg clazz: Class)

    @Update
    fun UpdateClasses(vararg clazz: Class)

    @Delete
    fun DeleteClasses(vararg clazz: Class)

    @Query("SELECT * FROM classes_table")
    fun SelectAllClasses(): Array<Class>

    @Query("SELECT * FROM classes_table WHERE `index` = :index")
    fun SelectClassesByIndex(index: Int): Array<Class>

    @Query("SELECT * FROM classes_table WHERE name LIKE :name")
    fun SelectClassesByName(name: String): Array<Class>
}