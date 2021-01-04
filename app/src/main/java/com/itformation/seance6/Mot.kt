package com.itformation.seance6

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity
data class Mot (var nom:String,var type_mot:String="",var indice:Int ): Serializable{
    @PrimaryKey(autoGenerate = true)
    var id:Long=0

}