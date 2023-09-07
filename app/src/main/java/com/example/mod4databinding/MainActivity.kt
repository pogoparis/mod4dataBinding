package com.example.mod4databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mod4databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contact = Contact("Tesla","Nikola","nikola@teslafundation.com",38)
    }
}