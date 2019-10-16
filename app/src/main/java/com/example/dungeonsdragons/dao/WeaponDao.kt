package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Weapon

@Dao
interface WeaponDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWeapons(vararg weapon: Weapon)

    @Update
    fun updateWeapons(vararg weapon: Weapon)

    @Delete
    fun deleteWeapons(vararg weapon: Weapon)

    @Query("SELECT * FROM weapons_table")
    fun loadAllWeapons(): Array<Weapon>

    @Query("SELECT * FROM weapons_table WHERE id = :id")
    fun loadWeaponById(id: Int): Array<Weapon>

    @Query("SELECT * FROM weapons_table WHERE name LIKE :name")
    fun loadWeaponsByName(name: String): Array<Weapon>

    @Query("SELECT * FROM weapons_table WHERE type LIKE :type")
    fun loadWeaponsByType(type: String): Array<Weapon>

    @Query("SELECT * FROM weapons_table WHERE weapon_category LIKE :category")
    fun loadWeaponsByCategory(category: String): Array<Weapon>
}