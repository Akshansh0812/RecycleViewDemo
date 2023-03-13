package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val fruitList: List<Fruit>) : RecyclerView.Adapter<MyViewHolder>() {

    //to create the view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
    // use to bind the data to the viewHolder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.bind(fruit)

    }
}

class MyViewHolder(val view : View):RecyclerView.ViewHolder(view){
    fun bind(fruit: Fruit){
        val myTextView = view.findViewById<TextView>(R.id.tvName)
        myTextView.text = fruit.name

        view.setOnClickListener {
            Toast.makeText(view.context,
                "Selected Fruit is ${fruit.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}