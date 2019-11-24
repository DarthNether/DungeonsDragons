package com.example.dungeonsdragons.views.ui.classes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.Class
import com.example.dungeonsdragons.viewmodels.ClassesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_classes.*


class FragmentClasses : Fragment() {
    private val classesViewModel by activityViewModels<ClassesViewModel>()
    private val classesAdapter by lazy { ClassesAdapter(::selectClassAndNavigateToDetails) }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        classes_recycler.run {
            adapter = classesAdapter
            layoutManager = LinearLayoutManager(context)
        }
        classesViewModel.classes.observe(viewLifecycleOwner,
            Observer {
                activity?.fab?.hide()
                classesAdapter.classes = it
                classesAdapter.notifyDataSetChanged()
            })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_classes, container, false)
    }

    fun selectClassAndNavigateToDetails(clazz: Class) {
        classesViewModel.selectedClass.value = clazz
        findNavController().navigate(R.id.get_class_specs)
    }
}