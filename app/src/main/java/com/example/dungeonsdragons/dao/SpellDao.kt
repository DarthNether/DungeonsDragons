package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Spell

@Dao
interface SpellDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSpells(vararg spell: Spell)

    @Update
    fun updateSpells(vararg spell: Spell)

    @Delete
    fun deleteSpells(vararg spell: Spell)

    @Query(" SELECT * FROM spells_table ")
    fun loadAllSpells(): Array<Spell>

    @Query(" SELECT * FROM spells_table WHERE id = :id ")
    fun loadSpellsById(id: Int): Array<Spell>

    @Query(" SELECT * FROM spells_table WHERE name LIKE :name ")
    fun loadSpellsByName(name: String): Array<Spell>

    @Query(" SELECT * FROM spells_table WHERE magic_school_id LIKE  :magic_school")
    fun loadSpellsByMagicSchool(magic_school: Int): Array<Spell>
}