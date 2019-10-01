package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Armor

@Dao
interface ArmorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertArmors(vararg armor: Armor)

    @Update
    fun updateArmors(vararg armor: Armor)

    @Delete
    fun deleteArmors(vararg armor: Armor)

    @Query("SELECT * FROM armors_table")
    fun loadAllArmors(): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE id = :id")
    fun loadArmorsById(id: Int): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE type LIKE :type")
    fun loadArmorsByType(type: String): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE name LIKE :name")
    fun loadArmorsByName(name: String): Array<Armor>
}