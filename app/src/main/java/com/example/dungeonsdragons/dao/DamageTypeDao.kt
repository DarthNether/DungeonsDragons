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
    fun selectAllDamageTypes(): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE `index` = :index")
    fun selectDamageTypeByIndex(index: Int): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE name LIKE :name")
    fun selectDamageTypeByName(name: String): Array<DamageType>
}