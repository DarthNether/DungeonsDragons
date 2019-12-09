package com.example.dungeonsdragons.utilities

import android.content.Context
import com.example.dungeonsdragons.database.DnDDatabase
import com.example.dungeonsdragons.repositories.AlignmentsRepository
import com.example.dungeonsdragons.repositories.CharactersRepository
import com.example.dungeonsdragons.repositories.ClassesRepository
import com.example.dungeonsdragons.repositories.RacesRepository

object InjectionUtils {
    fun getClassesRepository(context: Context) =
        ClassesRepository.getInstance(DnDDatabase.getInstance(context).classDao())

    fun getRacesRepository(context: Context) =
        RacesRepository.getInstance(DnDDatabase.getInstance(context).raceDao())

    fun getCharactersRepository(context: Context) =
        CharactersRepository.getInstance(DnDDatabase.getInstance(context).characterDao())

    fun getAlignmentsRepository(context: Context) =
        AlignmentsRepository.getInstance(DnDDatabase.getInstance(context).alignmentDao())
}