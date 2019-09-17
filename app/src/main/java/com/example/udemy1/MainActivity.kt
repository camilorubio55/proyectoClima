package com.example.udemy1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tvCiudad: TextView? = null
    var tvGrados: TextView? = null
    var tvEstatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ciudad = intent.getStringExtra("com.example.udemy1.CIUDAD")
        val ciudadBer = Ciudad("Berlin",15,"Nublado")
        val ciudadCuc = Ciudad("Cucuta",40,"Soleado")

        if(ciudad == "Cucuta"){
            idCiudad.text = ciudadCuc.nombre
            idClima.text = ciudadCuc.estatus
            idGrados.text = ciudadCuc.grados.toString()
        }else if(ciudad == "Berlin"){
            idCiudad.text = ciudadBer.nombre
            idClima.text = ciudadBer.estatus
            idGrados.text = ciudadCuc.grados.toString()
        }else
            Toast.makeText(this,"No se encontro la info",Toast.LENGTH_SHORT).show()

        //Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show()
    }
}
