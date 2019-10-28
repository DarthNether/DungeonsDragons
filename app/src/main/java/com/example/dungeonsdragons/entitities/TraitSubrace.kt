package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "traits_subraces_table",
    foreignKeys = [
        ForeignKey(
            entity = Subrace::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("subrace")
        ),
        ForeignKey(
            entity = Trait::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("trait")
        )
    ]
)
data class TraitSubrace(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "subrace") val subrace: Int,
    @ColumnInfo(name = "trait") val trait: Int
)