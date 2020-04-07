package com.otus.otuswebinarfirstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val name = "fds"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("denis")

        println(human.toString()) // Human is denis
        println(human as? String) // null

    }

    class Human(val name: String) {
        override fun toString(): String {
            return "Human is $name"
        }
    }
}
