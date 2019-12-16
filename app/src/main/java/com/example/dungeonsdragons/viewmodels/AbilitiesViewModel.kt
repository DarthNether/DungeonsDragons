package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.Ability
import com.example.dungeonsdragons.utilities.InjectionUtils.getAbilitiesRepository
import kotlinx.coroutines.launch

class AbilitiesViewModel(app: Application) : AndroidViewModel(app) {
    private val abilitiesRepository = getAbilitiesRepository(app.applicationContext)

    var abilities = MutableLiveData<Array<Ability>>()

    fun loadAbilities() {
        viewModelScope.launch { abilities.value = abilitiesRepository.loadAbilities() }
    }
}