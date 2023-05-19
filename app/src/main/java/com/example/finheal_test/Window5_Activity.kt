package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window5_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window5)
    }

    fun clickGoHomeW5(go: View){
        GoHomeW5()
    }

    fun GoHomeW5(){
        val GoHomeW5Intent = Intent(this, Window4_Activity::class.java)
        startActivity(GoHomeW5Intent)
    }

    fun GoForm(go: View){
        GoFormW5()
    }
    fun GoFormW5(){
        val GoFormW5Intent = Intent(this, Window7_Activity::class.java)
        startActivity(GoFormW5Intent)
    }

    fun GoMenu(go: View){
        GoMenuW5()
    }
    fun GoMenuW5(){
        val GoMenuW5Intent = Intent(this, Window8_Activity::class.java)
        startActivity(GoMenuW5Intent)
    }
}