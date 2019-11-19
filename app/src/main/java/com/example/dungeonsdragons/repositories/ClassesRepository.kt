package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.ClassDao

class ClassesRepository(private val class_dao: ClassDao) {
    suspend fun getAllClasses() = class_dao.loadAllClasses()

    companion object {
        @Volatile
        private var instance: ClassesRepository? = null

        fun getInstance(class_dao: ClassDao) =
            instance ?: synchronized(this) {
                instance ?: ClassesRepository(class_dao).also { instance = it }
            }
    }
}