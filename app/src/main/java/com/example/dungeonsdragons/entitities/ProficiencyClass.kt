package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "proficiencies_classes_table",
    foreignKeys = [
        ForeignKey(
            entity = Proficiency::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("proficiency")
        ),
        ForeignKey(
            entity = Class::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("class")
        )
    ]
)
data class ProficiencyClass(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "proficiency") val proficiency: Int,
    @ColumnInfo(name = "class") val clazz: Int
)