package com.example.pc1_wendy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        //operaciones
        val sumavalor= valor1.text.toString().toInt()+valor2.text.toString().toInt()


        val message =intent.getStringExtra("param")
        val textView = findViewById<TextView>(R.id.valorSuma)
        textView.text = message


    }
}


/*
private fun sumanum(sumavalor:Int){
    val sumavalor= valor1.text.toString().toInt()+valor2.text.toString().toInt()

}

private fun restanum(restavalor:Int){
    val restavalor= valor1.text.toString().toInt()-valor2.text.toString().toInt()
}

private fun multinum(multivalor:Int){
    val multivalor= valor1.text.toString().toInt()*valor2.text.toString().toInt()
}

private fun divisionnum(divisionvalor:Int){
    val divisionvalor= valor1.text.toString().toInt()/valor2.text.toString().toInt()
}*/
