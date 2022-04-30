package com.example.pc1_wendy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1: EditText = findViewById(R.id.valor1)
        val valor2: EditText = findViewById(R.id.valor2)
        btnEnviar.setOnClickListener{
            this.SendMessage(valor1.text.toString());
            this.SendMessage(valor2.text.toString());
            val intent: Intent= Intent(this,ResultadoActivity::class.java)
            intent.putExtra("param", valor1);
            intent.putExtra("param", valor2);

        }

    }

    private fun sendMessage(message: String){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("param", message)

        startActivity(intent)
    }
}