package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val fruitList = listOf<Fruit>(
        Fruit("Mango","joe"),
        Fruit("Apple","frank"),
        Fruit("Banana","Tom"),
        Fruit("Guava","Alex"),
        Fruit("Lemon","John"),
        Fruit("Papaya","Jerry"),
        Fruit("Grapes","Ben"),
        Fruit("Orange","Chris")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitList)
    }
}