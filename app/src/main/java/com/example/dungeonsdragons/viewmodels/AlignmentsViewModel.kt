package com.example.dungeonsdragons.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.dungeonsdragons.entitities.Alignment
import com.example.dungeonsdragons.utilities.InjectionUtils.getAlignmentsRepository
import kotlinx.coroutines.launch

class AlignmentsViewModel(app: Application) : AndroidViewModel(app) {
    private val alignmentsRepository = getAlignmentsRepository(app.applicationContext)
    val alignments = MutableLiveData<Array<Alignment>>()
    val selectedAlignment = MutableLiveData<Alignment>()

    init {
        loadAlignments()
    }

    fun loadAlignments() {
        viewModelScope.launch { alignments.value = alignmentsRepository.getAllAlignments() }
    }
}