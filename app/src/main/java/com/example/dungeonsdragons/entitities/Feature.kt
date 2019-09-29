package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "features_table",
    foreignKeys = [
        ForeignKey(
            entity = Subclass::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("subclass")
        ),
        ForeignKey(
            entity = Class::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("clazz")
        )
    ]
)
data class Feature(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "level") val level: Int,
    @ColumnInfo(name = "class") val clazz: Int,
    @ColumnInfo(name = "subclass") val subclass: Int,
    @ColumnInfo(name = "desc") val desc: String
)