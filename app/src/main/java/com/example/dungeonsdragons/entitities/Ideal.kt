package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "ideals_table",
    foreignKeys = [
        ForeignKey(
            entity = Background::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("background")
        )
    ]
)
data class Ideal(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "background") val background: Int
)