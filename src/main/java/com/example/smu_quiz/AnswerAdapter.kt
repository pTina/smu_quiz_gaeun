package com.example.smu_quiz

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class AnswerAdapter(val context: Context, val answerList:ArrayList<Answer>, val itemClick: (Answer) -> Unit):
        RecyclerView.Adapter<AnswerAdapter.Holder>(){

    inner class Holder(itemView: View, itemClick: (Answer) -> Unit) : RecyclerView.ViewHolder(itemView){


        val answerCheckbox =  itemView.findViewById<CheckBox>(R.id.cbCheckBox)
        val answerContents = itemView.findViewById<TextView>(R.id.tvContents)


        fun bind(answer: Answer, context: Context){
            answerContents.text = answer.contents

            answerCheckbox.setOnClickListener { itemClick(answer) }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view =  LayoutInflater.from(context).inflate(
            R.layout.item_answer,parent,false
        )

        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return answerList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.bind(answerList[position], context)

        holder.answerCheckbox.setOnClickListener(object: View.OnClickListener{
            val correct =1
            val intent = Intent(context, AnswerCorrect::class.java)
            val intent2 = Intent(context, AnswerWrong::class.java)

            override fun onClick(v: View){
                if(position+1 == correct){
                    startActivity(context,intent,null)
                }else{
                    startActivity(context,intent2,null)
                }
            }

        })
    }


}