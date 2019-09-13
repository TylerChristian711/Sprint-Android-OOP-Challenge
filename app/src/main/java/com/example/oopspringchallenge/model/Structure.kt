package com.example.oopspringchallenge.model

class Structure( name:String, isFavorite:Boolean, id:Int, val age:String):AOEobject(id, name,isFavorite){
    override fun info(): String {
        return "$name is a structure from age $age"
    }
}