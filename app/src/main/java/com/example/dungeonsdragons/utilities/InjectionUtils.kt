package com.example.dungeonsdragons.utilities

import android.content.Context
import com.example.dungeonsdragons.database.DnDDatabase
import com.example.dungeonsdragons.repositories.*

object InjectionUtils {
    fun getClassesRepository(context: Context) =
        ClassesRepository.getInstance(DnDDatabase.getInstance(context).classDao())

    fun getRacesRepository(context: Context) =
        RacesRepository.getInstance(DnDDatabase.getInstance(context).raceDao())

    fun getCharactersRepository(context: Context) =
        CharactersRepository.getInstance(DnDDatabase.getInstance(context).characterDao())

    fun getAlignmentsRepository(context: Context) =
        AlignmentsRepository.getInstance(DnDDatabase.getInstance(context).alignmentDao())

    fun getAbilityScoresRepository(context: Context) =
        AbilityScoresRepository.getInstance(DnDDatabase.getInstance(context).abilityScoreDao())

    fun getSkillsRepository(context: Context) =
        SkillsRepository.getInstance(DnDDatabase.getInstance(context).skillDao())

    fun getAbilitiesRepository(context: Context) =
        AbilitiesRepository.getInstance(DnDDatabase.getInstance(context).abilityDao())
}