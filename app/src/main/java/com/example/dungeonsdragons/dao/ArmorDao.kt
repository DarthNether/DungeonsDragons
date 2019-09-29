package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Armor

@Dao
interface ArmorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertArmors(vararg armor: Armor)

    @Update
    fun UpdateArmors(vararg armor: Armor)

    @Delete
    fun DeleteArmors(vararg armor: Armor)

    @Query("SELECT * FROM armors_table")
    fun SelectAllArmors(): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE `index` = :index")
    fun SelectArmorsByIndex(index: Int): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE type LIKE :type")
    fun SelectArmorsByType(type: String): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE name LIKE :name")
    fun SelectArmorsByName(name: String): Array<Armor>
}