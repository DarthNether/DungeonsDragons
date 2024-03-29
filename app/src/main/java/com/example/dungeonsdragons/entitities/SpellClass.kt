package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "spells_classes_table",
    foreignKeys = [
        ForeignKey(
            entity = Spell::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("spell")
        ),
        ForeignKey(
            entity = Class::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("class")
        )
    ]
)
data class SpellClass(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "spell") val spell: Int,
    @ColumnInfo(name = "class") val clazz: Int
)