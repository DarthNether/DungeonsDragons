package com.example.dungeonsdragons.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.dungeonsdragons.dao.*
import com.example.dungeonsdragons.entitities.*
import com.example.dungeonsdragons.utilities.ioThread

@Database(
    entities = [Ability::class, Armor::class, Background::class, Bond::class, Class::class,
        Condition::class, DamageType::class, Equipment::class, Feature::class, Flaw::class, Ideal::class,
        Language::class, Level::class, MagicSchool::class, PersonalityTrait::class,
        Proficiency::class, ProficiencyBackground::class, ProficiencyClass::class,
        ProficiencyRace::class, Race::class, RaceLanguage::class, Skill::class, Spell::class,
        SpellClass::class, SpellRace::class, Subclass::class, Subrace::class, Trait::class,
        Weapon::class],
    version = 1
)
abstract class DnDDatabase : RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE: DnDDatabase? = null

        fun getInstance(context: Context): DnDDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                DnDDatabase::class.java, "DnD Database"
            )
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        //insert the data on the IO Thread
                        //insert abilities
                        ioThread {
                            getInstance(context).abilityDao()
                                .insertAbilities(*PREPOPULATE_ABILITIES)
                        }

                        //insert skills
                        ioThread {
                            getInstance(context).skillDao()
                                .insertSkills(*PREPOPULATE_SKILLS)
                        }

                        //insert races
                        ioThread {
                            getInstance(context).raceDao()
                                .insertRaces(*PREPOPULATE_RACES)
                        }

                        //insert classes
                        ioThread {
                            getInstance(context).classDao()
                                .insertClasses(*PREPOPULATE_CLASSES)
                        }

                        ioThread {
                            getInstance(context).subraceDao()
                                .insertSubraces(*PREPOPULATE_SUBRACES)
                        }
                    }
                }).build()
    }


    abstract fun abilityDao(): AbilityDao
    abstract fun armorDao(): ArmorDao
    abstract fun backgroundDao(): BackgroundDao
    abstract fun bondDao(): BondDao
    abstract fun classDao(): ClassDao
    abstract fun conditionDao(): ConditionDao
    abstract fun damageTypeDao(): DamageTypeDao
    abstract fun equipmentDao(): EquipmentDao
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
}