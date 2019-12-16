package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.Race
import com.example.dungeonsdragons.utilities.InjectionUtils.getRacesRepository
import kotlinx.coroutines.launch

class RacesViewModel(app: Application) : AndroidViewModel(app) {
    private val racesRepository = getRacesRepository(app.applicationContext)
    val races = MutableLiveData<Array<Race>>()
    val selectedRace = MutableLiveData<Race>()

    init {
        loadRaces()
    }

    fun loadRaces() {
        viewModelScope.launch { races.value = racesRepository.getAllRaces() }
    }

    fun loadRaceById(id: Int) {
        viewModelScope.launch { selectedRace.value = racesRepository.getRaceById(id) }
    }
}