package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "subraces_table",
    foreignKeys = [ForeignKey(
        entity = Race::class,
        parentColumns = arrayOf("index"),
        childColumns = arrayOf("race")
    )]
)
data class Subrace(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "race") val race: Int,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "str_bonus") val str_bonus: Int?,
    @ColumnInfo(name = "dex_bonus") val dex_bonus: Int?,
    @ColumnInfo(name = "con_bonus") val cons_bonus: Int?,
    @ColumnInfo(name = "int_bonus") val int_bonus: Int?,
    @ColumnInfo(name = "wis_bonus") val wis_bonus: Int?,
    @ColumnInfo(name = "cha_bonus") val cha_bonus: Int?
)