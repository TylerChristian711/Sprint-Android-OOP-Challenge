package com.example.oopspringchallenge.model

import java.io.Serializable

abstract class AOEobject(val id:Int,val name:String):Serializable{
    fun info():String{
        return name
    }
}
