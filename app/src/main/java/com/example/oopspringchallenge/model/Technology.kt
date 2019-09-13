package com.example.oopspringchallenge.model

class Technology( name:String, id:Int,isFavorite:Boolean ,val age:String, val gold:Int):AOEobject(id,name,isFavorite){
    override fun info():String{
        return "$name is a from the technology branch found in $age, for the coast of $gold gold"
    }
}