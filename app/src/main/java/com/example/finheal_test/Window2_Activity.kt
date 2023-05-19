package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window2_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window2)
    }

    //Función para confirmar logueo e ir a la ventana de home
    fun ClickLoginW2 (log: View){
        LoginHome()
    }

    fun LoginHome(){
        val LoginHIntent = Intent(this, Window4_Activity::class.java)
        startActivity(LoginHIntent)
    }

    //Función para ir a la ventana de Registro
    fun ClickSignupW2 (sign: View){
        SignupW2()
    }

    fun SignupW2(){
        val SignUpW2Intent = Intent(this, Window3_Activity::class.java)
        startActivity(SignUpW2Intent)
    }

}