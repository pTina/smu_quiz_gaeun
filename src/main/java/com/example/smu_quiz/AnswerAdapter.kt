package com.example.smu_quiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnswerAdapter(val context: Context, val answerList:ArrayList<Answer>):
        RecyclerView.Adapter<AnswerAdapter.Holder>(){

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val answerCheckbox =  itemView.findViewById<CheckBox>(R.id.cbCheck)
        val answerContent = itemView.findViewById<TextView>(R.id.tvContent)

        fun bind(answer: Answer, Context: Context){
            answerContent.text = answer.answer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view =  LayoutInflater.from(context).inflate(
            R.layout.item_answer,parent,false
        )
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return answerList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.bind(answerList[position], context)
    }

}