package com.example.dungeonsdragons.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.dao.AbilityDao
import com.example.dungeonsdragons.dao.RaceDao
import com.example.dungeonsdragons.dao.SkillDao
import com.example.dungeonsdragons.database.DnDDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var db: DnDDatabase
    private lateinit var abilityDao: AbilityDao
    private lateinit var skillDao: SkillDao
    private lateinit var raceDao: RaceDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        db = Room.inMemoryDatabaseBuilder(this.applicationContext, DnDDatabase::class.java).build()
//
//        raceDao = db.raceDao()
//
//        ioThread {
//            raceDao.insertRaces(*PREPOPULATE_RACES)
//
//            val byName = raceDao.loadRaceByName("Tiefling")
//            Log.w("Bonus: ", byName[0].name)
//        }
//
//        db.close()
    }
}
