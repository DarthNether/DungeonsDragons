package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Alignment

@Dao
interface AlignmentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAlignments(vararg alignments: Alignment)

    @Update
    fun updateAlignments(vararg alignments: Alignment)

    @Delete
    fun deleteAlignments(vararg alignments: Alignment)

    @Query("SELECT * FROM alignments_table")
    suspend fun loadAllAlignments(): Array<Alignment>

    @Query("SELECT * FROM alignments_table WHERE id = :id")
    fun loadAlignmentById(id: Int): Array<Alignment>


}