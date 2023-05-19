package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window8_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window8)
    }

    fun GoHome(go: View){
        GoHomew8()
    }

    fun GoHomew8(){
        val GoHomew8Intent = Intent(this, Window4_Activity::class.java)
        startActivity(GoHomew8Intent)
    }
}