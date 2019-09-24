package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "proficiencies_table")
data class Proficiency(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "name") val name: String
)