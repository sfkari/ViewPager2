package com.cmc.explorerlemaroc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailsVillesFragment : Fragment() {
    companion object {
        var idVille: Int = 0
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_details_villes, container, false)

        val imageView: ImageView = view.findViewById(R.id.detailImage)
        val titre: TextView = view.findViewById(R.id.titreDetail)
        val textView: TextView = view.findViewById(R.id.detailVilleText)
        val btnRetour:Button = view.findViewById(R.id.btnListeVilles)

        when (idVille) {
            0 -> {
                imageView.setImageResource(R.drawable.casablanca)
                titre.text = "Casablanca"
                textView.text = "Casablanca, la plus grande ville du Maroc, est un important centre économique et commercial, c'est une ville dynamique qui combine modernité et traditions, ce qui en fait une destination fascinante à explorer.."
            }
            1 -> {
                imageView.setImageResource(R.drawable.marrakech)
                titre.text = "Marrakech"
                textView.text = "Marrakech est l'une des villes les plus emblématiques du Maroc. Connue pour son atmosphère vibrante, son histoire riche et sa culture colorée, Marrakech attire des millions de visiteurs chaque année."
            }
            2 -> {
                imageView.setImageResource(R.drawable.rabatville)
                titre.text = "Rabat"
                textView.text = "Rabat, capitale du Maroc, est une ville historique sur la côte atlantique. Elle allie architecture islamique et européenne, avec des sites comme la Kasbah des Oudayas. Rabat offre une ambiance calme et des marchés animés."
            }
            3 -> {
                imageView.setImageResource(R.drawable.tangerville)
                titre.text = "Tanger"
                textView.text = "Tanger est une ville portuaire située au nord du Maroc, c'est une ville fascinante qui allie histoire, culture et modernité, en faisant une destination incontournable pour ceux qui souhaitent découvrir le Maroc."
            }
            4 -> {
                imageView.setImageResource(R.drawable.chefchaouen)
                titre.text = "Chefchaouen"
                textView.text = "Chefchaouen souvent appelée la ville bleue, est une destination unique, offrant un mélange de beauté naturelle, d'architecture fascinante et d'hospitalité chaleureuse, en faisant un lieu incontournable à visiter au Maroc."
            }
        }
        btnRetour.setOnClickListener {
            (activity as MainActivity).viewPager.currentItem = 1
        }
        return view
    }
}
