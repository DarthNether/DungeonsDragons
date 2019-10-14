package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Class
import com.example.dungeonsdragons.entitities.Spell
import com.example.dungeonsdragons.entitities.SpellClass

@Dao
interface SpellClassDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSpellClass(vararg spellClass: SpellClass)

    @Query(
        """ SELECT * FROM spells_table 
        INNER JOIN spells_classes_table ON spells_table.id = spells_classes_table.spell 
        WHERE spells_classes_table.class = :clazz
    """
    )
    fun loadSpellsByClass(clazz: Int): Array<Spell>

    @Query(
        """ SELECT * FROM classes_table  
        INNER JOIN spells_classes_table ON classes_table.id = spells_classes_table.class 
        WHERE spells_classes_table.spell = :spell
    """
    )
    fun loadClassesBySpell(spell: Int): Array<Class>
}