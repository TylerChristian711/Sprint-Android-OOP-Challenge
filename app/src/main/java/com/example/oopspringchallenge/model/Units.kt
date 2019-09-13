package com.example.oopspringchallenge.model

class Units( name:String, id:Int, isFavorite:Boolean ,val description:String, val expansion:String, val age:String,val range:Int):AOEobject(id,name,isFavorite){
    override fun info(): String {
        return "This is the $name, info of the unit here $description"
    }
}

