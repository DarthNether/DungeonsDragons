package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "proficiencies_backgrounds_table",
    foreignKeys = [
        ForeignKey(
            entity = Proficiency::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("proficiency")
        ),
        ForeignKey(
            entity = Background::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("background")
        )]
)
data class ProficiencyBackground(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "proficiency") val proficiency: Int,
    @ColumnInfo(name = "background") val background: Int
)