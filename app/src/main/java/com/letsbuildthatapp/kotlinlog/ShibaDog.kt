package com.letsbuildthatapp.kotlinlog

import android.util.Log

class ShibaDog: Dog {

    constructor(name: String, age: Int): super(name, age){

    }

    override fun say() {
        super.say()
        Log.d("kotlintest","this is shibaDog")
    }
}