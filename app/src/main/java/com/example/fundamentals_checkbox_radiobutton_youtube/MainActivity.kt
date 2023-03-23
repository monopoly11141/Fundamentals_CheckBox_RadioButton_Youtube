package com.example.fundamentals_checkbox_radiobutton_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import com.example.fundamentals_checkbox_radiobutton_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val btnOrder = binding.btnOrder

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = binding.rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked

            val orderString = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "") +
                    (if(onions) "\nOnions" else "") +
                    (if(salad) "\nSalad" else "")

            binding.tvOrder.text = orderString

        }
    }
}