package com.itformation.seance6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MotAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mot_detail_activty)




        //Retour
        val b=findViewById<Button>(R.id.bAnnuler)
        b.setOnClickListener{
            finish()
        }

        //Ajouter un mot
        val bAjout=findViewById<Button>(R.id.bModifier)
        bAjout.setOnClickListener{
            val etNom=findViewById<EditText>(R.id.etNom)
            val etType=findViewById<EditText>(R.id.etType)
            val etIndice=findViewById<EditText>(R.id.etIndice)
            val m=Mot(etNom.text.toString(),etType.text.toString(),etIndice.text.toString().toInt())
            val  rp=MotRepository(this)
            rp.addMot(m)
            finish()
        }
    }
}