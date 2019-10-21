package com.example.dungeonsdragons.entitities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "spells_table",
    foreignKeys = [
        ForeignKey(
            entity = MagicSchool::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("magic_school")
        )]
)
data class Spell(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "magic_school") val magic_school: Int,
    @ColumnInfo(name = "range") val range: Int,
    @ColumnInfo(name = "casting_time") val time: String,
    @ColumnInfo(name = "duration") val duration: String,
    @ColumnInfo(name = "components") val comp: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "higher_levels") val higher_levels: String
)