package com.example.smu_quiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MuldipleChoiceAdapter (val context: Context, val multiplechoiceList: ArrayList<MultipleChoice>) : BaseAdapter() {

    override fun getCount(): Int {
        return multiplechoiceList.size

    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getItem(position: Int): Any {
        return multiplechoiceList[position]
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.multiplechoice_item, null)

        val multipleContent = view.findViewById<TextView>(R.id.tvMultipleChoiceContent)
        val multiple = multiplechoiceList[position]
        multipleContent.text =multiple.choice

        return view

    }
}