package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.Class
import com.example.dungeonsdragons.utilities.InjectionUtils.getClassesRepository
import kotlinx.coroutines.launch

class ClassesViewModel(app: Application) : AndroidViewModel(app) {
    private val classesRepository = getClassesRepository(app.applicationContext)
    val classes = MutableLiveData<Array<Class>>()
    val selectedClass = MutableLiveData<Class>()

    init {
        loadClasses()
    }

    fun loadClasses() {
        viewModelScope.launch { classes.value = classesRepository.getAllClasses() }
    }

    fun loadClassById(id: Int) {
        viewModelScope.launch { selectedClass.value = classesRepository.getClassById(id) }
    }
}