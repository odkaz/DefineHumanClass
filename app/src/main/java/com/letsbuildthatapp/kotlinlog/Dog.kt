package com.letsbuildthatapp.kotlinlog

import android.util.Log

open class Dog: Animal, Movable{

    constructor(name: String, age: Int): super(name, age){

    }


    override open fun say(){
        Log.d("kotlintest",this.name + this.age.toString())
    }

    override fun move() {
        Log.d("kotlintest", this.name + "run at his full speed")
    }
}