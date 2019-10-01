package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "armors_table")
data class Armor(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "ac_base") val ac_base: Int,
    @ColumnInfo(name = "ac_dex_mod") val ac_dex_mod: Boolean,
    @ColumnInfo(name = "ac_dex_mod_max") val ac_dex_mod_max: Int?,
    @ColumnInfo(name = "strength") val strength: Int?,
    @ColumnInfo(name = "stealth") val stealth: String?,
    @ColumnInfo(name = "cost_value") val cost_value: Int,
    @ColumnInfo(name = "cost_coin") val cost_coin: Int,
    @ColumnInfo(name = "weight") val weight: Int
)