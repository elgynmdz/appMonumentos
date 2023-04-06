package com.mostoles.cdp.pruebareciclye

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DramaAdapter (private val dramalist:ArrayList<Drama>)
    :RecyclerView.Adapter<DramaAdapter.DramaViewHolder>(){
    var onItemClick:((Drama) -> Unit)?=null
    class DramaViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.drama)
        val textView: TextView = itemView.findViewById(R.id.dramatextview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DramaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each, parent, false)
        return DramaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DramaViewHolder, position: Int) {
        val drama =dramalist[position]
        holder.imageView.setImageResource(drama.image)
        holder.textView.text = drama.name
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(drama)
        }
    }

    override fun getItemCount(): Int {
        return dramalist.size

    }

}
