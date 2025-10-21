package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editText.addTextChangedListener {
            Log.d("EditText1013", "현재 입력 값=${it.toString()}")

            if (it.toString().length >= 8) {
                Log.d("EditText", "8자 이상일 때만 출력-${it.toString()}")
            }
        }
    }
}
