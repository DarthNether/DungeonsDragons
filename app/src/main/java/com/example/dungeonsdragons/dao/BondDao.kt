package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Bond

@Dao
interface BondDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBonds(vararg bonds: Bond)

    @Update
    fun updateBonds(vararg bonds: Bond)

    @Delete
    fun deleteBonds(vararg bond: Bond)

    @Query("SELECT * FROM bonds_table WHERE background = :background")
    fun loadBonds(background: Int): Array<Bond>
}