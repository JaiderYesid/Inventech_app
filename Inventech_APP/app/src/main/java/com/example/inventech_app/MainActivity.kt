package com.example.inventech_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.AppCompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextID = findViewById<EditText>(R.id.editTextID)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        btnIngresar.setOnClickListener {
            val id = editTextID.text.toString().trim().toIntOrNull()

            if (id == 1 || id == 2) {
                val intent = Intent(this, SegundaActividad::class.java)
                intent.putExtra("ROL", id)
                startActivity(intent)
            } else {
                textViewResultado.text = "ID de rol no válido"
            }
        }
    }
}

