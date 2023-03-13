package com.example.recyclerview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var newsArrayList: ArrayList<News>, var context :Activity):
RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): MyAdapter. MyViewHolder{

    }
    override fun onBindViewHolder (holder: MyAdapter. MyViewHolder, position: Int) {

    }
    override fun getItemCount(): Int {

    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

}