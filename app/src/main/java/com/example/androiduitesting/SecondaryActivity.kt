package com.example.androiduitesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androiduitesting.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buBack.setOnClickListener {
            onBackPressed()
        }
    }
}