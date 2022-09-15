package com.example.odin_1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myEmptyList = emptyList<Char>()
        val myList = myEmptyList.toMutableList()

        val str = "ABCDEFGH"

        for (i in 0..str.length-1) {
            myList.add(str[i])
        }

        var myString: String = ""
        for (j in 0..myList.size-1) {
            myString = myString + myList.get(j) + " | "
        }

        val myText: TextView
        myText = findViewById(R.id.myText)

        myText.text = myString
    }



}
