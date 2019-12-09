package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "characters_table",
    foreignKeys = [
        ForeignKey(
            entity = Alignment::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("alignment")
        ),
        ForeignKey(
            entity = Race::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("race")
        ),
        ForeignKey(
            entity = Class::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("class")
        )]
)
class Character(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val char_name: Int?,
    @ColumnInfo(name = "alignment") val alignment: String?,
    @ColumnInfo(name = "characteristics") val characteristics: String?,
    @ColumnInfo(name = "personality") val peronality: String?,
    @ColumnInfo(name = "backstory") val backstory: String?,
    @ColumnInfo(name = "race") val race: Int?,
    @ColumnInfo(name = "class") val clazz: Int?
)