package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "classes_table")
data class Class(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "hit_die") val hit_die: Int,
    @ColumnInfo(name = "icon") val icon: Int,
    @ColumnInfo(name = "class desc") val desc: String,
    @ColumnInfo(name = "pic") val pic: Int
)