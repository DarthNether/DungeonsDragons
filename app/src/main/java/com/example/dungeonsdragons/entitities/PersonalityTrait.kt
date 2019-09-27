package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "personality_traits_table",
    foreignKeys = [
        ForeignKey(
            entity = Background::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("background")
        )
    ]
)
data class PersonalityTrait(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "trait") val trait: String,
    @ColumnInfo(name = "background") val background: Int
)