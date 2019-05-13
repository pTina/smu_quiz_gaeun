package com.example.smu_quiz

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.total_result.*

class TotalResult : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.total_result)

        tvBoxWrongAnswer.setOnClickListener{
            val intent = Intent(applicationContext, WrongSolving::class.java)
            startActivity(intent)
        }

        tvBoxGotoMain.setOnClickListener {
            val intent2 = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}