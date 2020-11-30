package com.itformation.seance6

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MotViewHolder(val tvMot: View) : RecyclerView.ViewHolder(tvMot){

    val tvNom=tvMot.findViewById<TextView>(R.id.txtNom)
    val tvType=tvMot.findViewById<TextView>(R.id.txtType)
    val tvIndice=tvMot.findViewById<TextView>(R.id.txtIndice)
}