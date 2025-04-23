package com.example.inventech_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val rol = intent.getIntExtra("ROL", 0)
        val textViewBienvenida = findViewById<TextView>(R.id.textViewBienvenida)

        textViewBienvenida.text = if (rol == 1) {
            "Bienvenido Administrador"
        } else {
            "Bienvenido Empleado"
        }
    }
}