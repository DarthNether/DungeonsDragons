package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Flaw

@Dao
interface FlawDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFlaws(vararg flaw: Flaw)

    @Update
    fun updateFlaws(vararg flaw: Flaw)

    @Delete
    fun deleteFlaws(vararg flaw: Flaw)

    @Query("SELECT * FROM flaws_table WHERE background LIKE :background")
    fun selectFlaws(background: Int): Array<Flaw>
}