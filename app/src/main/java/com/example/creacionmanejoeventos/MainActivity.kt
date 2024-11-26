package com.example.creacionmanejoeventos

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.creacionmanejoeventos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Asignamos un evento a nuestros botones*/
        binding.BtnIniciarSesion.setOnClickListener{
            Toast.makeText(applicationContext, "Iniciar sesion",
                Toast.LENGTH_SHORT).show()
        }

        binding.BtnRegistrarme.setOnClickListener{
            //Que nos diriga  ala actividad de registro
            val intent = Intent(this@MainActivity, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}