package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.ClassDao

class ClassesRepository(private val classesDao: ClassDao) {
    suspend fun getAllClasses() = classesDao.loadAllClasses()
    suspend fun getClassById(id: Int) = classesDao.loadClassById(id)

    companion object {
        @Volatile
        private var instance: ClassesRepository? = null

        fun getInstance(classesDao: ClassDao) =
            instance ?: synchronized(this) {
                instance ?: ClassesRepository(classesDao).also { instance = it }
            }
    }
}