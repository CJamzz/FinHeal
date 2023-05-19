package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window7_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window7)
    }

    fun goHome(go: View){
        GoHomeW7()
    }

    fun GoHomeW7(){
        val GoHomew7Intent = Intent(this, Window4_Activity::class.java)
        startActivity(GoHomew7Intent)
    }
    fun GoMenu(go: View){
        GoMenuW8()
    }
    fun GoMenuW8(){
        val GoMenuW8Intent = Intent(this, Window8_Activity::class.java)
        startActivity(GoMenuW8Intent)
    }
}