package com.example.myapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var now = 9
        when (now){
            8-> {
                Log.d("when","현재 시간은 8시 입니다.")
            }
            9, 10-> {
                Log.d("when","현재 시간은 9시 또는 10시 입니다.")
            }
            else -> {
                Log.d("when", "지금은 8시 ~ 10시가 아닙니다.")
            }
        }

    }
}