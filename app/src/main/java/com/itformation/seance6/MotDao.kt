package com.itformation.seance6

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE


@Dao
interface MotDao {

    @Query("select * from mot")
    fun getMot():List<Mot>

    @Insert(onConflict = IGNORE)
   fun  addMot(m:Mot):Long

   @Delete
   fun delete(m:Mot)

   @Update(onConflict = IGNORE)
   fun update(m:Mot)

}