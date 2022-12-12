package com.example.androidtaskround

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageBack:ImageView=findViewById(R.id.imageBack)
        val progressBar:ProgressBar=findViewById(R.id.progressBar)
        val head:TextView=findViewById(R.id.head)
        val content:TextView=findViewById(R.id.content)
        val next:ImageButton=findViewById(R.id.next)
        val getStarted:Button=findViewById(R.id.getStarted)
        var progress:Int=2

        val imageList:ArrayList<Int> = arrayListOf(R.drawable.background1,R.drawable.background2,R.drawable.background3)
        val headList:ArrayList<String> = arrayListOf("Feeling stressed?","Healthy body, Healthy mind","Psychotherapy")
        val contentList:ArrayList<String>  = arrayListOf(
            "Everyone feels stressed from time to time and don’t know how to deal with it. We have curated many different ways to help you cope up with stress. Find people with whom you can talk, experts to assist you and meditation tricks to ease up your mind",
            "A balance between body and mind is the key to happy life. take some moment to meditate or to self evaluate your mental health with the resources curated by us",
            "Psychotherapy is teaching new ways of thinking and behaving. It aims at changing habits that may cause depression. Connect with the experts to clear out your mind and get the right advices."
        )
        getStarted.visibility=Button.INVISIBLE

        next.setOnClickListener(){
            if(progress<=progressBar.max){
                imageBack.setImageDrawable(ContextCompat.getDrawable(this,imageList[progress-1]))
                progressBar.progress=progress

                head.text=headList[progress-1]
                content.text=contentList[progress-1]
                if(progress==progressBar.max){
                    getStarted.visibility=Button.VISIBLE
                    next.visibility=Button.INVISIBLE
                }
                progress++

            }
        }


    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}