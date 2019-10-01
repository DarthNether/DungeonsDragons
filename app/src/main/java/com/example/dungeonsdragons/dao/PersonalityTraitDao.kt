package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.PersonalityTrait

@Dao
interface PersonalityTraitDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPersonalityTraits(vararg personalityTrait: PersonalityTrait)

    @Update
    fun updatePersonalityTraits(vararg personalityTrait: PersonalityTrait)

    @Delete
    fun deletePersonalityTraits(vararg personalityTrait: PersonalityTrait)

    @Query("SELECT * FROM personality_traits_table")
    fun loadAllPersonalityTraits(): Array<PersonalityTrait>

    @Query("SELECT * FROM personality_traits_table WHERE background LIKE :background")
    fun loadPersonalityTraitsByBackground(background: Int): Array<PersonalityTrait>
}