package com.example.oopspringchallenge.model

 class Civ(name:String, id:Int,isFavorite:Boolean ,val expansion:String, val army_type:String):AOEobject(id,name,isFavorite){
     override fun info():String{
         return "This is the $name empire, they are first found in $expansion.There army is made up of $army_type"
     }
 }