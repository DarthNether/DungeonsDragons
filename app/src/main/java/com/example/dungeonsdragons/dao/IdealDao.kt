package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Ideal

@Dao
interface IdealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertIdeals(vararg ideal: Ideal)

    @Update
    fun updateIdeals(vararg ideal: Ideal)

    @Delete
    fun deleteIdeals(vararg ideal: Ideal)

    @Query("SELECT * FROM ideals_table WHERE background = :background")
    fun loadIdeals(background: Int): Array<Ideal>
}