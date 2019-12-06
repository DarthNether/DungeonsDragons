package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "abilty_scores_table",
    foreignKeys = [
        ForeignKey(
            entity = Ability::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("ability")
        ),
        ForeignKey(
            entity = Character::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("character")
        )]
)
class AbilityScore(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "character") val character: Int,
    @ColumnInfo(name = "ability") val ability: Int,
    @ColumnInfo(name = "score") val score: Int
)