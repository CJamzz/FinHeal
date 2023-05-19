package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window3_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window3)
    }

    //Función para confirmar el registro
    fun ClickSignupW3(sign: View){
        SignupW3()
    }

    fun SignupW3(){
        val SignupIntentW3 = Intent(this, Window2_Activity::class.java)
        startActivity(SignupIntentW3)
    }

    //Función para ir de SignUp a Login
    fun ClickLoginW3(log: View){
        LoginW3()
    }

    fun LoginW3(){
        val LoginW3Intent = Intent(this, Window2_Activity::class.java)
        startActivity(LoginW3Intent)
    }
}