package com.example.smu_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var multiplechoiceList = arrayListOf<MultipleChoice>(
        MultipleChoice(0, "이상(Anomaly)"),
        MultipleChoice(0,"제한(Restriction)"),
        MultipleChoice(0,"종속성(Dependency)"),
        MultipleChoice(0,"변환(Translation)")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multipleAdapter = MuldipleChoiceAdapter(this,multiplechoiceList)
        lvMainMultipleChoice.adapter = multipleAdapter

        ibtQuestionHintShow.setOnClickListener(object : View.OnClickListener{
            override  fun onClick(v: View){
                tvQuestionHintContent.setText("데이터의 중복으로 인하여 곤란한 관계연산을 처리할 때 곤란한 형상이 발생하는 것을 무엇이라고 한다.")
                tvQuestionHintContent.visibility = VISIBLE

            }
        })

    }




}
