package com.example.finheal_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Window4_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.window4)
    }

    //función para ir a Incomes
    fun ClickGoIncomesW4(goInc: View){
        GoIncomesW4()
    }

    fun GoIncomesW4(){
        val GoIncomesW4Intent = Intent(this, Window5_Activity::class.java)
        startActivity(GoIncomesW4Intent)
    }

    //función para ir a Outlyes
    fun ClickGoOutlyesW4(goOut: View){
        GoOutlyesw4()
    }

    fun GoOutlyesw4(){
        val GoOutlyesIntent = Intent(this, Window6_Activity::class.java)
        startActivity(GoOutlyesIntent)
    }

    fun GoMenu(go: View){
        GoMenuW8()
    }
    fun GoMenuW8(){
        val GoMenuW8Intent = Intent(this, Window8_Activity::class.java)
        startActivity(GoMenuW8Intent)
    }
}