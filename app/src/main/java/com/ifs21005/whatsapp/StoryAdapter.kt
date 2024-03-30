package com.ifs21005.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter (val listStory : ArrayList<Story>) : RecyclerView.Adapter<StoryAdapter.MyViewHolder>(){
    inner class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var profilePict : ImageView
        var nama : TextView
        var waktu : TextView

        init {
            profilePict = itemView.findViewById(R.id.status_pertama)
            nama = itemView.findViewById(R.id.nama_story)
            waktu = itemView.findViewById(R.id.waktu_story)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.story_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listStory.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nama.text = listStory[position].nama
        holder.profilePict.setImageResource(listStory[position].fotoProfil)
        holder.waktu.text = listStory[position].waktu
    }
}