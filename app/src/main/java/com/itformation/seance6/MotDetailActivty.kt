package com.itformation.seance6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
const val RES_CODE=10
class MotDetailActivty : AppCompatActivity() {
var motD:Mot?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mot_detail_activty)

        motD=intent.getSerializableExtra("mot") as Mot

        val etNom=findViewById<EditText>(R.id.etNom)
        val etType=findViewById<EditText>(R.id.etType)
        val etIndice=findViewById<EditText>(R.id.etIndice)
        val  rp=MotRepository(this)
        motD?.let{
     etNom.setText(it.nom)
     etType.setText(it.type_mot)
      etIndice.setText(it.indice.toString())
        }
        //Retour
        val bAnnuler=findViewById<Button>(R.id.bAnnuler)
        bAnnuler.setOnClickListener{

            finish()
        }

        //Ajout un mot
        val bModifier=findViewById<Button>(R.id.bModifier)
        bModifier.setOnClickListener{
            motD?.let{
                it.nom=etNom.text.toString()
                it.type_mot=etType.text.toString()
                it.indice=etIndice.text.toString().toInt()
                rp.modifierMot(it)
            }
            finish()
        }
        //Suppressier d'un mot
        val bSupprimer=findViewById<Button>(R.id.bSupprimer)
        bSupprimer.setOnClickListener{
            motD?.let{

                rp.supprimerMot(it)
            }
            finish()
        }
    }
}