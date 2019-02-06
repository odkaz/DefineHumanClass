package com.letsbuildthatapp.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man1 = Human("Nishikori", 29, "Tennis")

        val woman1 = Human("Osaka", 21, "Tennis")

        man1.say()
        man1.think()

        woman1.say()
        woman1.think()

        /*
        val wanchan = Dog("king",19)
        wanchan.say()
        wanchan.move()

        val shiba = ShibaDog("Jonny",  10)
        shiba.say()
        */
    }


}
