package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "proficiencies_races_table",
    foreignKeys = [
        ForeignKey(
            entity = Proficiency::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("proficiency")
        ),
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("race")
        )
    ]
)
data class ProficiencyRace(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "proficiency") val proficiency: Int,
    @ColumnInfo(name = "race") val race: Int
)