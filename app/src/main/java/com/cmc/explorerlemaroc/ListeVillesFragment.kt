package com.cmc.explorerlemaroc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListeVillesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: VilleAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_liste_villes, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        adapter = VilleAdapter { idVille ->
            (activity as MainActivity).viewPager.currentItem = 2
            DetailsVillesFragment.idVille = idVille
        }

        recyclerView.adapter = adapter
        return view
    }
}

