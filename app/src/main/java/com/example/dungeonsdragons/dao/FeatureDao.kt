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
    fun loadAllFeatures(): Array<Feature>

    @Query("SELECT * FROM features_table WHERE id = :id")
    fun loadFeaturesById(id: Int): Array<Feature>

    @Query("SELECT * FROM features_table WHERE name LIKE :name")
    fun loadFeaturesByName(name: String): Array<Feature>

    @Query("SELECT * FROM features_table WHERE class = :clazz")
    fun loadFeaturesByClass(clazz: Int): Array<Feature>

    @Query("SELECT * FROM features_table WHERE subclass = :subclass")
    fun loadFeaturesBySubClass(subclass: Int): Array<Feature>
}