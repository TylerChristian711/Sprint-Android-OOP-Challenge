package com.example.oopspringchallenge.model

import java.io.Serializable

abstract class AOEobject(open val id:Int, open val name:String,open var isFavorite:Boolean):Serializable{
    open fun info():String{
        return name
    }
}
  var chineseCiv = Civ("Chinese",5,false,"Age of Kings","Archer")
  var gothsCiv = Civ("Goths",7,false,"Age of Kings","Infantry")

  var CS =  Structure("House",false,5,"Dark")
  var GS = Structure("Mill",false,7,"Dark")

  var CT = Technology("Heavy Cavalry Archer",5,false,"Imperial",500)
  var GT = Technology("Man At Arms",7,false,"Feudal",40)

 var CU = Units("Heavy Cavalry Archer",5,false,"Upgrade Cavalry Archer","Age of Kings","Imperial",4)
 var GU = Units("Skirmisher",7,false,"Ranged unit equipped with armor vs. archer attacks","Age of Kings","Feudal",1-4)


val myCivs = mutableListOf(chineseCiv,gothsCiv,CS,GS,CT,GT,CU,GU)