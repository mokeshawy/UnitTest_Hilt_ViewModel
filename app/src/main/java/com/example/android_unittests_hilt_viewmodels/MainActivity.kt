package com.example.android_unittests_hilt_viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android_unittests_hilt_viewmodels.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val tax = Tax()
        val netIncome   = tax.calculateIncome(100.0,0.1)
        val netTax      = tax.calculateTax(100.0,0.1)

        println(netIncome)
        println(netTax)
    }
}