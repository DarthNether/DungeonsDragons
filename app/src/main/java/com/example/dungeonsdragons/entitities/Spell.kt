package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spells_table")
data class Spell(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "type") val type: Int,
    @ColumnInfo(name = "range") val range: Int,
    @ColumnInfo(name = "casting_time") val time: String,
    @ColumnInfo(name = "duration") val duration: String,
    @ColumnInfo(name = "components") val comp: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "higher_levels") val higher: String
)