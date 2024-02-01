package com.morrison.msu.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.morrison.msu.countingapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val count = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListener()

    }

    private fun setupClickListener() {
        binding.btn1.setOnClickListener{
            count.addCount()
            binding.tv1.text = count.getCount().toString()
        }
    }
}


