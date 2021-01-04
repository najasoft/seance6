package com.itformation.seance6

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = arrayOf(Mot::class),version = 10,exportSchema = false)
abstract  class MotDatabase2: RoomDatabase() {
        abstract fun getMotDao():MotDao
}