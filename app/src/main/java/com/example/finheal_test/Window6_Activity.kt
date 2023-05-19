package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window6_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window6)
    }
    fun clickGoHomeW6(go: View){
        GoHomeW5()
    }

    fun GoHomeW5(){
        val GoHomeW6Intent = Intent(this, Window4_Activity::class.java)
        startActivity(GoHomeW6Intent)
    }

    fun GoForm(go: View){
        GoFormW6()
    }
    fun GoFormW6(){
        val GoFormW6Intent = Intent(this, Window7_Activity::class.java)
        startActivity(GoFormW6Intent)
    }
    fun GoMenu(go: View){
        GoMenuW8()
    }
    fun GoMenuW8(){
        val GoMenuW8Intent = Intent(this, Window8_Activity::class.java)
        startActivity(GoMenuW8Intent)
    }
}