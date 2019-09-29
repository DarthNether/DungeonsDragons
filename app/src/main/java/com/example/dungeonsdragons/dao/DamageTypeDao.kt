package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.DamageType

@Dao
interface DamageTypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertDamageTypes(vararg damageType: DamageType)

    @Update
    fun UpdateDamageTypes(vararg damageType: DamageType)

    @Delete
    fun DeleteDamageTypes(vararg damageType: DamageType)

    @Query("SELECT * FROM dmg_types_table")
    fun SelectAllDamageTypes(): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE `index` = :index")
    fun SelectDamageTypeByIndex(index: Int): Array<DamageType>

    @Query("SELECT * FROM dmg_types_table WHERE name LIKE :name")
    fun SelectDamageTypeByName(name: String): Array<DamageType>
}