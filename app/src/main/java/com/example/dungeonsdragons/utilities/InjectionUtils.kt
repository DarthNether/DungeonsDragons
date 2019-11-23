package com.example.dungeonsdragons.utilities

import android.content.Context
import com.example.dungeonsdragons.database.DnDDatabase
import com.example.dungeonsdragons.repositories.ClassesRepository

object InjectionUtils {
    fun getClassesRepository(context: Context) =
        ClassesRepository.getInstance(DnDDatabase.getInstance(context).classDao())
}