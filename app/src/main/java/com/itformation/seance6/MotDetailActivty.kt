package com.itformation.seance6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MotDetailActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mot_detail_activty)
        val data:Mot=intent.getSerializableExtra("mot") as Mot

        val etNom=findViewById<EditText>(R.id.etNom)
        val etType=findViewById<EditText>(R.id.etType)
        val etIndice=findViewById<EditText>(R.id.etIndice)
        etNom.setText(data.nom)
        etType.setText(data.type_mot)
        etIndice.setText(data.indice.toString())

        //Retour
        val b=findViewById<Button>(R.id.bRetour)
        b.setOnClickListener{
            finish()
        }

        //Ajout un mot


    }
}