package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Feature

@Dao
interface FeatureDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFeatures(vararg feature: Feature)

    @Update
    fun updateFeatures(vararg feature: Feature)

    @Delete
    fun deleteFeatures(vararg feature: Feature)

    @Query("SELECT * FROM features_table")
    fun selectAllFeatures(): Array<Feature>

    @Query("SELECT * FROM features_table WHERE `index` = :index")
    fun selectFeaturesByIndex(index: Int): Array<Feature>

    @Query("SELECT * FROM features_table WHERE name LIKE :name")
    fun selectFeaturseByName(name: String): Array<Feature>

    @Query("SELECT * FROM features_table WHERE class = :clazz")
    fun selectFeaturesByClass(clazz: Int)

    @Query("SELECT * FROM features_table WHERE subclass = :subclass")
    fun selectFeaturesBySubClass(subclass: Int)
}