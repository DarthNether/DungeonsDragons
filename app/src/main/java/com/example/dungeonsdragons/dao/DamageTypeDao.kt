package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.DamageType

@Dao
interface DamageTypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDamageTypes(vararg damageType: DamageType)

    @Update
    fun updateDamageTypes(vararg damageType: DamageType)

    @Delete
    fun deleteDamageTypes(vararg damageType: DamageType)

    @Query("SELECT * FROM dmg_types_table")
    fun loadAllDamageTypes(): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE id = :id")
    fun loadDamageTypeById(id: Int): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE name LIKE :name")
    fun loadDamageTypeByName(name: String): Array<DamageType>
}