package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "traits_races_table",
    foreignKeys = [
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("race")
        ),
        ForeignKey(
            entity = Trait::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("trait")
        )
    ]
)
data class TraitRace(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "race") val race: Int,
    @ColumnInfo(name = "trait") val trait: Int
)