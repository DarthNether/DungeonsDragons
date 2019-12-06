package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alignments_table")
class Alignment(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String
)