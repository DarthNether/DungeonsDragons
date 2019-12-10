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
    @ColumnInfo(name = "name") var char_name: String?,
    @ColumnInfo(name = "alignment") var alignment: String?,
    @ColumnInfo(name = "appearance") var appearance: String?,
    @ColumnInfo(name = "personality") var personality: String?,
    @ColumnInfo(name = "backstory") var backstory: String?,
    @ColumnInfo(name = "race") var race: Int?,
    @ColumnInfo(name = "class") var clazz: Int?
)