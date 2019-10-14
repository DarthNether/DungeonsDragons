package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Class
import com.example.dungeonsdragons.entitities.Subclass

@Dao
interface SubclassDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSubclasses(vararg subclass: Subclass)

    @Update
    fun updateSubclasses(vararg subclass: Subclass)

    @Delete
    fun deleteSubclasses(vararg subclass: Subclass)

    @Query("SELECT * FROM subclasses_table")
    fun loadAllSubclasses(): Array<Subclass>

    @Query("SELECT * FROM subclasses_table WHERE id = :id")
    fun loadSubclassById(id: Int): Array<Subclass>

    @Query("SELECT * FROM subclasses_table WHERE name LIKE :name")
    fun loadSubclassByName(name: String): Array<Subclass>

    @Query("SELECT * FROM subclasses_table WHERE class like :clazz")
    fun loadSubclassesByClass(clazz: Class)
}