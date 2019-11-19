package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.InjectionUtils.getClassesRepository
import com.example.dungeonsdragons.entitities.Class
import kotlinx.coroutines.launch

class ClassesViewModel(app: Application) : AndroidViewModel(app) {
    private val classesRepository = getClassesRepository(app.applicationContext)
    val classes = MutableLiveData<Array<Class>>()

    init {
        loadClasses()
    }

    fun loadClasses() {
        viewModelScope.launch { classes.value = classesRepository.getAllClasses() }
    }
}