package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "races_table")
data class Race(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "speed") val speed: Int,
    @ColumnInfo(name = "str_bonus") val str_bonus: Int = 0,
    @ColumnInfo(name = "dex_bonus") val dex_bonus: Int = 0,
    @ColumnInfo(name = "con_bonus") val cons_bonus: Int = 0,
    @ColumnInfo(name = "int_bonus") val int_bonus: Int = 0,
    @ColumnInfo(name = "wis_bonus") val wis_bonus: Int = 0,
    @ColumnInfo(name = "cha_bonus") val cha_bonus: Int = 0,
    @ColumnInfo(name = "alignment") val align: String?,
    @ColumnInfo(name = "age") val age: String?,
    @ColumnInfo(name = "size") val size: String,
    @ColumnInfo(name = "size_desc") val size_desc: String?
)