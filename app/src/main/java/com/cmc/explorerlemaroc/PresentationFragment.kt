package com.cmc.explorerlemaroc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class PresentationFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_presentation,
            container, false)
        val button: Button = view.findViewById(R.id.btnListeVilles)
        button.setOnClickListener {
            (activity as MainActivity).viewPager.currentItem = 1
        }
        return view
    }
}
