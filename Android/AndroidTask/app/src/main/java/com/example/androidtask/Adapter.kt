package com.example.androidtask

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(private  var products: ArrayList<Product>,
private var books:ArrayList<Book>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private  lateinit var  binding: Adapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
products.size

    }
}