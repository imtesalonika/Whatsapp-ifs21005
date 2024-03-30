package com.ifs21005.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.LinkedList

class MyAdapter (val listChat : ArrayList<ChatData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    inner class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var profilePict : ImageView
        var nama : TextView
        var text : TextView
        var tanggal : TextView

        init {
            profilePict = itemView.findViewById(R.id.imagecontact)
            nama = itemView.findViewById(R.id.contactname)
            text = itemView.findViewById(R.id.pesan_textview)
            tanggal = itemView.findViewById(R.id.tanggal_pesan)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listChat.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nama.text = listChat[position].name
        holder.profilePict.setImageResource(listChat[position].profilePict)
        holder.text.text =  listChat[position].text
        holder.tanggal.text = listChat[position].date
    }
}