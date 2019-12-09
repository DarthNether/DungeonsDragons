package com.example.dungeonsdragons.repositories

import com.example.dungeonsdragons.dao.AlignmentDao

class AlignmentsRepository(private val alignmentsDao: AlignmentDao) {
    suspend fun getAllAlignments() = alignmentsDao.loadAllAlignments()

    companion object {
        @Volatile
        private var instance: AlignmentsRepository? = null

        fun getInstance(alignmentsDao: AlignmentDao) =
            instance ?: synchronized(this) {
                instance ?: AlignmentsRepository(alignmentsDao).also { instance = it }
            }
    }
}