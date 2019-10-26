package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "proficiencies_subraces_table",
    foreignKeys = [
        ForeignKey(
            entity = Proficiency::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("proficiency")
        ),
        ForeignKey(
            entity = Subrace::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("subrace")
        )]
)
data class ProficiencySubrace(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "proficiency") val proficiency: Int,
    @ColumnInfo(name = "subrace") val subrace: Int
)