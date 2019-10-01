package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.MagicSchool

@Dao
interface MagicSchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMagicShools(vararg magicSchool: MagicSchool)

    @Update
    fun updateMagicSchools(vararg magicSchool: MagicSchool)

    @Delete
    fun deleteMagicSchools(vararg magicSchool: MagicSchool)

    @Query("SELECT * FROM magic_schools_table")
    fun loadAllMagicSchools(): Array<MagicSchool>

    @Query("SELECT * FROM magic_schools_table WHERE id = :id")
    fun loadMagicSchoolsById(id: Int): Array<MagicSchool>

    @Query("SELECT * FROM magic_schools_table WHERE name LIKE :name")
    fun loadMagicSchoolsByName(name: String): Array<MagicSchool>
}