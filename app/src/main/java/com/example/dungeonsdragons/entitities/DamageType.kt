package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dmg_types_table")
data class DamageType(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String
)