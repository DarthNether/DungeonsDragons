package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "backgrounds_table")
data class Background(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "languages") val languages: String,
    @ColumnInfo(name = "equipment") val equipment: String,
    @ColumnInfo(name = "feature_name") val feature_name: String,
    @ColumnInfo(name = "feature_desc") val feature_desc: String
)