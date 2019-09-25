package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "races_table")
data class Race(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "speed") val speed: Int,
    @ColumnInfo(name = "str_bonus") val str_bonus: Int?,
    @ColumnInfo(name = "dex_bonus") val dex_bonus: Int?,
    @ColumnInfo(name = "con_bonus") val cons_bonus: Int?,
    @ColumnInfo(name = "int_bonus") val int_bonus: Int?,
    @ColumnInfo(name = "wis_bonus") val wis_bonus: Int?,
    @ColumnInfo(name = "cha_bonus") val cha_bonus: Int?,
    @ColumnInfo(name = "alignment") val align: String?,
    @ColumnInfo(name = "age") val age: String?,
    @ColumnInfo(name = "size") val size: String,
    @ColumnInfo(name = "size_desc") val size_desc: String?
)