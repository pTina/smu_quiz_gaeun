package com.example.smu_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var answerList= arrayListOf<Answer>(

        Answer("0","이상(Anomaly)"),
        Answer("0","제한(Restriction)"),
        Answer("0","종속성(Dependency)"),
        Answer("0","변환(Translation)")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        var i = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mAdapter = AnswerAdapter(this,answerList)
        lvMainMultipleChoice.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        lvMainMultipleChoice.layoutManager = lm
        lvMainMultipleChoice.setHasFixedSize(true)



        ibtQuestionHintShow.setOnClickListener(object : View.OnClickListener{
            override  fun onClick(v: View){

                i = 1-i


                if(i ==0){
                    tvQuestionHintContent.setText()
                    tvQuestionHintContent.visibility = VISIBLE
                }
                else{
                    tvQuestionHintContent.visibility = GONE
                }
            }

        })

    }




}
