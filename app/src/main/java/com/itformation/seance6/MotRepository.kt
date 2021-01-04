package com.itformation.seance6

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

class MotRepository(context:Context) {
    var db:MotDatabase2= Room.databaseBuilder(context.applicationContext,MotDatabase2::class.java,"dbMot2s")
        .allowMainThreadQueries().fallbackToDestructiveMigration().build()
    var dao=db.getMotDao()
    fun addMot(m:Mot):Long{
        return dao.addMot(m)
    }

    fun getMots():List<Mot>{
       return  dao.getMot()
    }

    fun modifierMot(m: Mot) {
    dao.update(m)
    }

    fun supprimerMot(m: Mot) {
    dao.delete(m)
    }
}