package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "spells_races_table",
    foreignKeys = [
        ForeignKey(
            entity = Spell::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("spell")
        ),
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("race")
        )]
)
data class SpellRace(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "spell") val spell: Int,
    @ColumnInfo(name = "race") val race: Int
)