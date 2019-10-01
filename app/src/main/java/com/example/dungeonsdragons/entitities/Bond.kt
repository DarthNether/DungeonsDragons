package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "bonds_table",
    foreignKeys = [
        ForeignKey(
            entity = Background::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("background")
        )
    ]
)
data class Bond(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "bond") val bond: String,
    @ColumnInfo(name = "background") val background: Int
)