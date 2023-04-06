package com.mostoles.cdp.pruebareciclye

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detalle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val drama = intent.getParcelableExtra<Drama>("drama")
        if(drama !=null){
            val textView : TextView=findViewById(R.id.detalletv)
            val imageView : ImageView= findViewById(R.id.detalleiv)
            val textdescripcion: TextView = findViewById(R.id.descripcion)
            textView.text = drama.name
            imageView.setImageResource(drama.image)
            textdescripcion.text = drama.descripcion
        }
    }
}