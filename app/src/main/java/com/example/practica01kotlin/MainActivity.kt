package com.example.practica01kotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var btnSaludar: Button? = null
    private var btnLimpiar: Button? = null
    private var btnCerrar: Button? = null
    private var lblSaludar: TextView? = null
    private var txtSaludo: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Relación de los objetos de java con las views xml
        btnSaludar = findViewById<View>(R.id.btnSaludar) as Button
        btnLimpiar = findViewById<View>(R.id.btnLimpiar) as Button
        btnCerrar = findViewById<View>(R.id.btnCerrar) as Button
        lblSaludar = findViewById<View>(R.id.lblSaludo) as TextView
        txtSaludo = findViewById<View>(R.id.txtSaludo) as EditText

        //Codificar el evento click del boton Saludar
        btnSaludar!!.setOnClickListener {
            //Aqui se realiza la programacion
            if (txtSaludo!!.text.toString().isEmpty()) {
                //Falto capturar nombre
                Toast.makeText(this@MainActivity, "Favor de ingresar el nombre", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val saludar = txtSaludo!!.text.toString()
                lblSaludar!!.text = "Hola $saludar Como estas?"
            }
        }
        //Codificar el evento click del boton limpiar
        btnLimpiar!!.setOnClickListener { //Aqui se realiza la programacion
            lblSaludar!!.text = ""
            txtSaludo!!.setText("")
            txtSaludo!!.requestFocus()
        }
        //Codificar el evento click del boton limpiar
        btnCerrar!!.setOnClickListener { //Aqui se realiza la programacion
            finish()
        }
    }
}