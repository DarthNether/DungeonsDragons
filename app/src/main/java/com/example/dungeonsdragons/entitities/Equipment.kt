package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "equipment_table")
data class Equipment(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "rarity") val rarity: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "weight") val weight: Int,
    @ColumnInfo(name = "cost_value") val cost_value: Int,
    @ColumnInfo(name = "cost_coin") val cost_coin: String
)