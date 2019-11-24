package com.example.dungeonsdragons.views.ui.classes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.viewmodels.ClassesViewModel
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_classes_specs.*

class FragmentClassesSpecs : Fragment() {
    private val classesViewModel by activityViewModels<ClassesViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_classes_specs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        classesViewModel.selectedClass.observe(viewLifecycleOwner,
            Observer {
                activity?.toolbar?.title = it.name
                txt_class_title.text = it.name
                img_class_pic.setImageDrawable(ContextCompat.getDrawable(requireContext(), it.pic))
                txt_class_desc.text = it.desc
            })
    }
}
