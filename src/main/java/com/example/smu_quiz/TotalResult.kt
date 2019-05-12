package com.example.smu_quiz

import android.content.res.Resources
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.total_result.*

class TotalResult : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.total_result)

        tvBoxGotoMain.setOnClickListener{
            tvBoxGotoMain.setBackgroundResource(R.drawable.round_fill)
        }
    }
}