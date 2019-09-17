package com.example.udemy1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ciudades.*

class ActivityCiudades : AppCompatActivity() {

    val TAG = "com.example.udemy1.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)
        val intent = Intent(this, MainActivity::class.java)
        bBerlin.setOnClickListener(View.OnClickListener {View ->
            intent.putExtra(TAG,"Berlin")
            startActivity(intent)
            //Toast.makeText(this,"Ciudad de Berlin", Toast.LENGTH_SHORT).show()
        })
        bCucuta.setOnClickListener(View.OnClickListener {View ->
            intent.putExtra(TAG, "Cucuta")
            startActivity(intent)
            //Toast.makeText(this,"Ciudad de Cucuta", Toast.LENGTH_SHORT).show()
        })
    }
}
