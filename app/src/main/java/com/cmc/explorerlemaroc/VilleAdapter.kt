package com.cmc.explorerlemaroc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VilleAdapter(private val onVilleClick: (Int) -> Unit) :
    RecyclerView.Adapter<VilleAdapter.VilleViewHolder>() {

    private val villes = listOf(
        DataVilles("Casablanca", R.drawable.casablanca, 0),
        DataVilles("Marrakech", R.drawable.marrakech, 1),
        DataVilles("Rabat", R.drawable.rabatville, 2),
        DataVilles("Tanger", R.drawable.tangerville, 3),
        DataVilles("Chefchaouen", R.drawable.chefchaouen, 4)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VilleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_villes, parent, false)
        return VilleViewHolder(view)
    }

    override fun onBindViewHolder(holder: VilleViewHolder, position: Int) {
        val ville = villes[position]
        holder.bind(ville, onVilleClick)
    }

    override fun getItemCount(): Int = villes.size

    class VilleViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        private val imageView: ImageView = itemView.findViewById(R.id.villeImage)
        private val textView: TextView = itemView.findViewById(R.id.villeNom)
        private val button: Button = itemView.findViewById(R.id.btnDetails)

        fun bind(ville: DataVilles, onVilleClick: (Int) -> Unit) {
            imageView.setImageResource(ville.imageVille)
            textView.text = ville.nomVille
            button.setOnClickListener { onVilleClick(ville.idVille) }
        }

    }
}
