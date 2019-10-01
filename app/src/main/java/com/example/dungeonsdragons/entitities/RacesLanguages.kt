package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "races_languages_table",
    foreignKeys = [
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("race")
        ),
        ForeignKey(
            entity = Language::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("language")
        )
    ]
)
data class RacesLanguages(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "race") val race: Int,
    @ColumnInfo(name = "language") val language: Int
)