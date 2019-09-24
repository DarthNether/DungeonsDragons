package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "skills_table",
    foreignKeys = [ForeignKey(
        entity = Ability::class,
        parentColumns = arrayOf("index"),
        childColumns = arrayOf("ability_index")
    )]
)
data class Skill(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "ability_index") val ability: Int
)