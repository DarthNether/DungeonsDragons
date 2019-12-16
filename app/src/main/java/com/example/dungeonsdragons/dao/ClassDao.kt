package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Class

@Dao
interface ClassDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClasses(vararg clazz: Class)

    @Update
    fun updateClasses(vararg clazz: Class)

    @Delete
    fun deleteClasses(vararg clazz: Class)

    @Query("SELECT * FROM classes_table")
    suspend fun loadAllClasses(): Array<Class>

    @Query("SELECT * FROM classes_table WHERE id = :id")
    suspend fun loadClassById(id: Int): Class

    @Query("SELECT * FROM classes_table WHERE name LIKE :name")
    fun loadClassesByName(name: String): Array<Class>
}