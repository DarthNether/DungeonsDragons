package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Bond

interface BondDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertBonds(vararg bonds: Bond)

    @Update
    fun UpdateBonds(vararg bonds: Bond)

    @Delete
    fun DeleteBonds(vararg bond: Bond)

    @Query("SELECT * FROM bonds_table WHERE background = :background")
    fun SelectBonds(background: Int): Array<Bond>
}