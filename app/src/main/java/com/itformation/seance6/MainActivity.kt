package com.itformation.seance6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity(),MotClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=MotsAdapter(this)
        val rv=findViewById<RecyclerView>(R.id.rvMots)
        rv.adapter=adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId==R.id.mnAjout)
            Toast.makeText(this,"Test",Toast.LENGTH_LONG)
  
        return super.onOptionsItemSelected(item)
    }

    override fun onMotClick(mot:Mot) {
        val intentDetail= Intent(this,MotDetailActivty::class.java)
        intentDetail.putExtra("mot",mot)
        startActivity(intentDetail)
    }
}