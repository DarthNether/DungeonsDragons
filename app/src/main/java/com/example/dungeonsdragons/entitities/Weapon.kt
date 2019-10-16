package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "weapons_table",
    foreignKeys = [
        ForeignKey(
            entity = DamageType::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("dmg_type")
        )
    ]
)
data class Weapon(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "weapon_range") val range: String,
    @ColumnInfo(name = "weapon_category") val category: String,
    @ColumnInfo(name = "cost_value") val cost_value: Int,
    @ColumnInfo(name = "cost_coin") val cost_coin: String,
    @ColumnInfo(name = "dmg_count") val dmg_count: Int,
    @ColumnInfo(name = "dmg_dice") val dmg_dice: Int,
    @ColumnInfo(name = "dmg_type") val dmg_type: Int,
    @ColumnInfo(name = "weight") val weight: Int,
    @ColumnInfo(name = "properties") val properties: String
)