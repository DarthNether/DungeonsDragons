package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Equipment

@Dao
interface EquipmentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertEquipment(vararg equipment: Equipment)

    @Update
    fun updateEquipment(vararg equipment: Equipment)

    @Delete
    fun deleteEquipment(vararg equipment: Equipment)

    @Query("SELECT * FROM equipment_table")
    fun loadAllEquipment(): Array<Equipment>

    @Query("SELECT * FROM equipment_table WHERE id = :id")
    fun loadEquipmentById(id: Int): Array<Equipment>

    @Query("SELECT * FROM equipment_table WHERE name LIKE :name")
    fun loadEquipmentByName(name: String): Array<Equipment>

    @Query("SELECT * FROM equipment_table WHERE type LIKE :type")
    fun loadEquipmentByType(type: String): Array<Equipment>

    @Query("SELECT * FROM equipment_table WHERE rarity LIKE :rarity")
    fun loadEquipmentByRarity(rarity: String): Array<Equipment>
}