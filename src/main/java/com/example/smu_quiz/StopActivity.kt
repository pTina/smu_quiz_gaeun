package com.example.smu_quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_stop.*

class StopActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stop)

        tvStopYes.setOnClickListener {
            val intent = Intent(this, MockTestStart::class.java)
            startActivity(intent)
        }
        tvStopNo.setOnClickListener {
            finish()
        }
    }



}