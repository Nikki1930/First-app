package com.example.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{

            val Input1 = binding.input1.text.toString().toInt()
            val Input2 = binding.input2.text.toString().toInt()

            binding.tVAnswer.text = (Input1 + Input2).toString()
        }

        binding.btnSubtract.setOnClickListener{

            val Input1 = binding.input1.text.toString().toInt()
            val Input2 = binding.input2.text.toString().toInt()

            binding.tVAnswer.text = (Input1 - Input2).toString()
        }

        binding.btnMultiply.setOnClickListener{

            val Input1 = binding.input1.text.toString().toInt()
            val Input2 = binding.input2.text.toString().toInt()

            binding.tVAnswer.text = (Input1 * Input2).toString()
        }

        binding.btnDivide.setOnClickListener{

            val Input1 = binding.input1.text.toString().toInt()
            val Input2 = binding.input2.text.toString().toInt()

            binding.tVAnswer.text = (Input1 / Input2).toString()
        }

    }
}