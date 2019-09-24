package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "languages_table")
data class Language(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: String
)