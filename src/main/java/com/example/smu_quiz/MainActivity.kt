package com.example.smu_quiz

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_answer.*
import kotlinx.android.synthetic.main.item_answer.view.*
import kotlinx.android.synthetic.main.mock_test_start.*

class MainActivity : AppCompatActivity() {

    var answerList= arrayListOf<Answer>(

        Answer("이상(Anomaly)"),
        Answer("제한(Restriction)"),
        Answer("종속성(Dependency)"),
        Answer("변환(Translation)")
    )

    var questionList= arrayListOf<Question>(
        Question("database","문제1번 내용 입니다.", 1, "문제1번 힌트"),
        Question("Algorithm","문제2번 내용 입니다.", 2, "문제2번 힌트"),
        Question("operation system","문제3번 내용 입니다.", 3, "문제3번 힌트"),
        Question("database","문제4번 내용 입니다.", 4, "문제4번 힌트")

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        var i = 0
        var j = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        tvMainTopTitle.setText(questionList[0].subject)
        tvMainQuestionContent.setText(questionList[0].content)
        tvMainQuestionNum.text="Question ${questionList[0].quiznum}"
        tvQuestionHintContent.setText(questionList[0].hint)

        tvNext.setOnClickListener {
            j += 1
            if(j < questionList.size){
                tvMainTopTitle.setText(questionList[j].subject)
                tvMainQuestionContent.setText(questionList[j].content)
                tvMainQuestionNum.text="Question ${questionList[j].quiznum}"
                tvQuestionHintContent.setText(questionList[j].hint)

            }else{
                Toast.makeText(this,"더이상 문제가 없습니다.",Toast.LENGTH_SHORT).show()
            }

        }

        tvQuestionHintContent.visibility = GONE

        val mAdapter = AnswerAdapter(this,answerList){ answer ->

        }
        rvMainMultipleChoice.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        rvMainMultipleChoice.layoutManager = lm
        rvMainMultipleChoice.setHasFixedSize(true)


        ibtQuestionHintShow.setOnClickListener(object : View.OnClickListener{
            override  fun onClick(v: View){

                i = 1-i

                if(i == 1){
                    tvQuestionHintContent.visibility = VISIBLE
                }
                else{
                    tvQuestionHintContent.visibility = GONE
                }
            }

        })

        ivMainLike.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View){

                i = 1-i

                if(i == 1){
                    ivMainLike.setImageResource(R.drawable.like_fill)
                    }else{
                    ivMainLike.setImageResource(R.drawable.like_empty)
                }
            }
        })




    }





}


