package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "traits_table",
    foreignKeys = [
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("race")
        ),
        ForeignKey(
            entity = Subrace::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("subrace")
        )
    ]
)
data class Trait(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "race") val race: Int,
    @ColumnInfo(name = "subrace") val subrace: Int?,
    @ColumnInfo(name = "level") val level: Int?
)