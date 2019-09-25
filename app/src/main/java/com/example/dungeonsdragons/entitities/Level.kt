package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "levels_table")
data class Level(
    @PrimaryKey(autoGenerate = true) val level: Int,
    @ColumnInfo(name = "xp_points") val xp_points: Int,
    @ColumnInfo(name = "proficiency_bonus") val proficiency_bonus: Int
)