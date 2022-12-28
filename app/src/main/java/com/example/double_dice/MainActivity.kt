package com.example.double_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
        imageView2 = findViewById(R.id.imageView2)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        val button:Button = findViewById(R.id.button)
        button.setOnClickListener { rollDice() }


    }
    private fun rollDice(){
        val num = (1..6).random()
        val num2 =(1..6).random()
        textView.text = num.toString()
        textView2.text = num2.toString()
        val image = when(num){
            1 ->R.drawable.dice1
            2 ->R.drawable.dice2
            3 ->R.drawable.dice3
            4 ->R.drawable.dice4
            5 ->R.drawable.dice5
            else ->R.drawable.dice6

        }
        imageView.setImageResource(image)

        val image2 = when(num2){
            1 ->R.drawable.dice1
            2 ->R.drawable.dice2
            3 ->R.drawable.dice3
            4 ->R.drawable.dice4
            5 ->R.drawable.dice5
            else ->R.drawable.dice6
        }
        imageView2.setImageResource(image2)
    }

}