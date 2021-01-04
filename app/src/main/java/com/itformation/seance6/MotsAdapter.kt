package com.itformation.seance6

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MotsAdapter(val clickListener: MotClickListener,val rp:MotRepository):RecyclerView.Adapter<MotViewHolder>() {

   //Source de données
   private var mots=rp.getMots()
       /*listOf<Mot>(Mot("Mot1","Type1",33),
           Mot("Mot2","Type 2",11),
           Mot("Mot3","Type 1",12))*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotViewHolder {

        Log.d("SE7","onCreateViewHolder est appelée")
        val layoutInflater =LayoutInflater.from(parent.context)
      val vue=  layoutInflater.inflate(R.layout.mot_layout,parent,false)
        as View
        return MotViewHolder(vue)

    }

    override fun onBindViewHolder(holder: MotViewHolder, position: Int) {
        val mot= mots[position]
        Log.d("SE7","onBindViewHolder est appelée, mot $mot.nom")
        holder.tvNom.text=mot.nom
        holder.tvType.text=mot.type_mot
        holder.tvIndice.text=mot.indice.toString()
        holder.itemView.setOnClickListener{
            clickListener.onMotClick(mots[position])
        }
    }

  /*  override fun getItemCount(): Int {
        return mots.size
    }

   */

    fun update (){
        mots=rp.getMots()
        notifyDataSetChanged()}
  override fun getItemCount()= mots.size

}