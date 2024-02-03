package com.altllc.challentsaving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Agregadon Boton Random Number
    private lateinit var BntRandom: Button

    // Texto que mostrara el numero Random
    private lateinit var TextRandom: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Funcion que Inicializa los componentes
        initcomponet()

        //Funcion que Inicializa el Listener
        initLisenert()
    }

    private fun initcomponet(){
        // LLamando elementos del Activity
        BntRandom = findViewById<Button>(R.id.BntRandom)
        TextRandom = findViewById<TextView>(R.id.NumRandom)
    }

    private fun initLisenert(){
        BntRandom.setOnClickListener {
            changeNumber()
        }
    }

    // Funcion que Asigna numero aleatorio y muestra en textview
    private fun changeNumber(){
        var NumberSelect: Int
        NumberSelect =  (0..101).random()
        NumberSelect.toString()

        TextRandom.text="Numero Seleccionado, $NumberSelect"

    }
}