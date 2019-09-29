package com.example.dungeonsdragons.dao

import androidx.room.*
import com.example.dungeonsdragons.entitities.Feature

@Dao
interface FeatureDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertFeatures(vararg feature: Feature)

    @Update
    fun UpdateFeatures(vararg feature: Feature)

    @Delete
    fun DeleteFeatures(vararg feature: Feature)

    @Query("SELECT * FROM features_table")
    fun SelectAllFeatures(): Array<Feature>

    @Query("SELECT * FROM features_table WHERE `index` = :index")
    fun SelectFeaturesByIndex(index: Int): Array<Feature>

    @Query("SELECT * FROM features_table WHERE name LIKE :name")
    fun SelectFeaturseByName(name: String): Array<Feature>

    @Query("SELECT * FROM features_table WHERE class = :clazz")
    fun SelectFeaturesByClass(clazz: Int)

    @Query("SELECT * FROM features_table WHERE subclass = :subclass")
    fun SelectFeaturesBySubClass(subclass: Int)
}