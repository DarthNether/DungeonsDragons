package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "skills_table",
    foreignKeys = [ForeignKey(
        entity = Ability::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("ability_id")
    )]
)
data class Skill(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "ability_id") val ability: Int
)