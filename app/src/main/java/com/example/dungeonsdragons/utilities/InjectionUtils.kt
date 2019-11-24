package com.example.dungeonsdragons.utilities

import android.content.Context
import com.example.dungeonsdragons.database.DnDDatabase
import com.example.dungeonsdragons.repositories.ClassesRepository
import com.example.dungeonsdragons.repositories.RacesRepository

object InjectionUtils {
    fun getClassesRepository(context: Context) =
        ClassesRepository.getInstance(DnDDatabase.getInstance(context).classDao())

    fun getRacesRepository(context: Context) =
        RacesRepository.getInstance(DnDDatabase.getInstance(context).raceDao())
}