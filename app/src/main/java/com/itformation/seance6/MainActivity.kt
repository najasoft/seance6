package com.itformation.seance6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar



const val  REQ_CODE=22
const val REQ_Mot_CODE=13
class MainActivity : AppCompatActivity(),MotClickListener {
    lateinit var   rp:MotRepository
     lateinit var adapter:MotsAdapter

    override fun onResume() {
        super.onResume()
        adapter.update()
        Log.i("#DD", "onResume called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rp=MotRepository(this)
        adapter=MotsAdapter(this,rp)
            /*  rp.addMot(    Mot("Mot1","Type1",33))
        rp.addMot( Mot("Mot2","Type 2",11))
        rp.addMot( Mot("Mot3","Type 1",12))*/

        val rv=findViewById<RecyclerView>(R.id.rvMots)
        rv.adapter=adapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId==R.id.mnAjout) {
                val intentionDetail = Intent(this, MotDetailActivty::class.java)
                startActivity(intentionDetail)
            }

  
        return super.onOptionsItemSelected(item)
    }

    override fun onMotClick(mot:Mot) {
        val intentDetail= Intent(this,MotDetailActivty::class.java)
        intentDetail.putExtra("mot",mot)
        startActivityForResult(intentDetail, REQ_Mot_CODE)
    }


}