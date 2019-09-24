package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "subclasses_table",
    foreignKeys = [
        ForeignKey(
            entity = Class::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("clazz")
        )
    ]
)
data class Subclass(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "class") val clazz: Int,
    @ColumnInfo(name = "desc") val desc: String
)