package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Subrace
import com.example.dungeonsdragons.entitities.Trait
import com.example.dungeonsdragons.entitities.TraitSubrace

@Dao
interface TraitSubraceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTraitSubrace(vararg traitSubrace: TraitSubrace)

    @Query(
        """ SELECT * FROM traits_table t
        INNER JOIN traits_subraces_table ts ON ts.trait = t.id
        WHERE ts.subrace = :subrace
    """
    )
    fun loadTraitsBySubrace(subrace: Int): Array<Trait>

    @Query(
        """ SELECT * FROM subraces_table s 
        INNER JOIN traits_subraces_table ts ON ts.subrace = s.id
        WHERE ts.trait = :trait
    """
    )
    fun loadSubracesByTrait(trait: Int): Array<Subrace>
}