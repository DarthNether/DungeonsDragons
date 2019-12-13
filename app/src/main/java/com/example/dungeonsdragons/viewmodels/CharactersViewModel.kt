package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.Character
import com.example.dungeonsdragons.utilities.InjectionUtils.getCharactersRepository
import kotlinx.coroutines.launch

class CharactersViewModel(app: Application) : AndroidViewModel(app) {
    private val charactersRepository = getCharactersRepository(app.applicationContext)
    val characters = MutableLiveData<Array<Character>>()
    val selectedCharacter = MutableLiveData<Character>()
    val insertId = MutableLiveData<Long>()

    init {
        loadCharacters()
    }

    fun loadCharacters() {
        viewModelScope.launch { characters.value = charactersRepository.getAllCharacters() }
    }

    fun insertCharacter(character: Character) {
        viewModelScope.launch { insertId.value = charactersRepository.insertCharacter(character) }
    }
}