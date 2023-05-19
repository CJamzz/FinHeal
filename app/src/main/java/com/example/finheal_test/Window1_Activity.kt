package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window1_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window1)
    }
    //Función para ir a la ventana de Logueo
    fun ClickLoginW1(Log: View){
        LoginWindow()
    }

    fun LoginWindow(){
        val LoginIntent = Intent(this,Window2_Activity::class.java)
        startActivity(LoginIntent)
    }

    //Función para ir a la ventana de Registro
    fun ClickSignW1(Sign: View){
        SignUpWindow()
    }
    fun SignUpWindow(){
        val SignUpIntent = Intent(this,Window3_Activity::class.java)
        startActivity(SignUpIntent)
    }
}