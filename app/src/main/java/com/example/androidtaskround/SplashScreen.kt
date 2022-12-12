package com.example.androidtaskround

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val myIntent: Intent = Intent(this,MainActivity::class.java)
        val handler: Handler = Handler()
        handler.postDelayed(Runnable{
            startActivity(myIntent)
            finish()
        },4000)

    }
}