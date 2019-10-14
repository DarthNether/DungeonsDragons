package com.example.dungeonsdragons.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dungeonsdragons.entitities.Class
import com.example.dungeonsdragons.entitities.Proficiency
import com.example.dungeonsdragons.entitities.ProficiencyClass

@Dao
interface ProficiencyClassDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProficiencyClass(vararg proficiencyClass: ProficiencyClass)

    @Query(
        """SELECT * FROM proficiencies_table
        INNER JOIN proficiencies_classes_table ON proficiencies_table.id = proficiencies_classes_table.proficiency 
        WHERE proficiencies_classes_table.class = :clazz
    """
    )
    fun loadProficienciesByClass(clazz: Int): Array<Proficiency>

    @Query(
        """SELECT * FROM classes_table 
        INNER JOIN proficiencies_classes_table ON classes_table.id = proficiencies_classes_table.class 
        WHERE proficiencies_classes_table.proficiency = :proficiency
    """
    )
    fun loadClassesByProficiency(proficiency: Int): Array<Class>
}