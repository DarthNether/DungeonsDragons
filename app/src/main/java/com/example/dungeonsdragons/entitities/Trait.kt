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
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("race")
        ),
        ForeignKey(
            entity = Subrace::class,
            parentColumns = arrayOf("index"),
            childColumns = arrayOf("subrace")
        )
    ]
)
data class Trait(
    @PrimaryKey(autoGenerate = true) val index: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "race") val race: Int,
    @ColumnInfo(name = "subrace") val subrace: Int?
)