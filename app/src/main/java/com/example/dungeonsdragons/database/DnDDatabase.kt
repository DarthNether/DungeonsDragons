package com.example.dungeonsdragons.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.dungeonsdragons.dao.*
import com.example.dungeonsdragons.entitities.*

@Database(
    entities = [Ability::class, Armor::class, Background::class, Bond::class, Class::class,
        Condition::class, DamageType::class, Feature::class, Flaw::class, Ideal::class,
        Language::class, Level::class, MagicSchool::class, PersonalityTrait::class,
        Proficiency::class, ProficiencyBackground::class, ProficiencyClass::class,
        ProficiencyRace::class, Race::class, RaceLanguage::class, Skill::class, Spell::class,
        SpellClass::class, SpellRace::class, Subclass::class, Subrace::class, Trait::class,
        Weapon::class],
    version = 1
)
abstract class DnDDatabase : RoomDatabase() {

    abstract fun abilityDao(): AbilityDao
    abstract fun armorDao(): ArmorDao
    abstract fun backgroundDao(): BackgroundDao
    abstract fun bondDao(): BondDao
    abstract fun classDao(): ClassDao
    abstract fun conditionDao(): ConditionDao
    abstract fun damageTypeDao(): DamageTypeDao
    abstract fun featureDao(): FeatureDao
    abstract fun flawDao(): FlawDao
    abstract fun idealDao(): IdealDao
    abstract fun languageDao(): LanguageDao
    abstract fun levelDao(): LevelDao
    abstract fun magicSchoolDao(): MagicSchoolDao
    abstract fun personalityTraitDao(): PersonalityTraitDao
    abstract fun proficiencyBackgroundDao(): ProficiencyBackgroundDao
    abstract fun proficiencyClassDao(): ProficiencyClassDao
    abstract fun proficiencyRaceDao(): ProficiencyRaceDao
    abstract fun proficiencyDao(): ProficiencyDao
    abstract fun raceDao(): RaceDao
    abstract fun racesLanguagesDao(): RacesLanguagesDao
    abstract fun skillDao(): SkillDao
    abstract fun spellClassDao(): SpellClassDao
    abstract fun spellDao(): SpellDao
    abstract fun spellRaceDao(): SpellRaceDao
    abstract fun subclassDao(): SubclassDao
    abstract fun subraceDao(): SubraceDao
    abstract fun traitDao(): TraitDao
    abstract fun weaponDaO(): WeaponDao

    companion object {
        @Volatile
        private var INSTANCE: DnDDatabase? = null

        fun getDatabase(context: Context): DnDDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DnDDatabase::class.java,
                    "dnd_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }

}