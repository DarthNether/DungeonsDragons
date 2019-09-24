package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "magic_schools_table")
data class MagicSchool(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String
)