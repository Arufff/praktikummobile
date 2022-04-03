package com.example.daduu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dadu1: ImageView = findViewById(R.id.dadu1)
        val dadu2: ImageView = findViewById(R.id.dadu2)
        val rndm1 = (1..6).random()
        val rndm2 = (1..6).random()

        val hasil1 = when(rndm1){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val hasil2 = when(rndm2){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dadu1.setImageResource(hasil1)
        dadu2.setImageResource(hasil2)

        if (hasil1 == hasil2){
            Toast.makeText(this,"Selamat anda dapat dadu double!", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"Anda belum beruntung!", Toast.LENGTH_SHORT).show()
        }
    }


}