package com.example.smu_quiz

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_answer.*

class MainActivity : AppCompatActivity() {

    val correct = 1

    var answerList= arrayListOf<Answer>(

        Answer(false,"이상(Anomaly)"),
        Answer(false,"제한(Restriction)"),
        Answer(false,"종속성(Dependency)"),
        Answer(false,"변환(Translation)")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        var i = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mAdapter = AnswerAdapter(this,answerList){ answer ->

        }
        lvMainMultipleChoice.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        lvMainMultipleChoice.layoutManager = lm
        lvMainMultipleChoice.setHasFixedSize(true)


        ibtQuestionHintShow.setOnClickListener(object : View.OnClickListener{
            override  fun onClick(v: View){

                i = 1-i


                if(i == 0){
                    tvQuestionHintContent.setText("힌트가 없습니다.")
                    tvQuestionHintContent.visibility = GONE
                }
                else{
                    tvQuestionHintContent.visibility = VISIBLE
                }
            }

        })

        ivMainLike.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View){

                i = 1-i

                if(i ==0){
                    ivMainLike.setImageResource(R.drawable.like_fill)
                    }else{
                    ivMainLike.setImageResource(R.drawable.like_empty)
                }
            }
        })



    }




}


