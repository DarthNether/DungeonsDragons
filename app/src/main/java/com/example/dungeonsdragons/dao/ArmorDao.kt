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
    fun selectAllArmors(): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE `index` = :index")
    fun selectArmorsByIndex(index: Int): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE type LIKE :type")
    fun selectArmorsByType(type: String): Array<Armor>

    @Query("SELECT * FROM armors_table WHERE name LIKE :name")
    fun selectArmorsByName(name: String): Array<Armor>
}