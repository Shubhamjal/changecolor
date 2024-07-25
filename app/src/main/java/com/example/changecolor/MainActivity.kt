package com.example.changecolor

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.changecolor.Fragment.InteractiveInterface
import com.example.changecolor.databinding.FragmentColorBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: FragmentColorBinding
    var interactiveInterface: InteractiveInterface? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        binding = FragmentColorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.changetextbtn.setOnClickListener{
            interactiveInterface?.Changecolor() //function calling that is declared inside interface
        }

    }

    fun changeText(){
        binding.changetextbtn.setText("changed by fragment")
    }



}