package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.AbilityScore

@Dao
interface AbilityScoreDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAbilityScores(vararg scores: AbilityScore)

    @Update
    fun updateAbilityScores(vararg scores: AbilityScore)

    @Delete
    fun deleteAbilityScores(vararg scores: AbilityScore)

    @Query(
        """SELECT * FROM abilty_scores_table s
        WHERE s.character = :id"""
    )
    suspend fun loadCharacterAbilities(id: Int): Array<AbilityScore>

    @Query(
        """SELECT * FROM abilty_scores_table s
        WHERE s.character = :character 
        AND s.ability = :ability """
    )
    fun loadCharacterAbility(character: Int, ability: Int): Array<AbilityScore>
}