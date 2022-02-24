package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var diceImg: ImageView
    private lateinit var diceImg2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.btn_roll)
        diceImg = findViewById(R.id.iv_dice_1)
        diceImg2 = findViewById(R.id.iv_dice_2)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        fun generateRandom(): Int {
            val image = when ((1..6).random()) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.dice_empty
            }
            return image
        }

        diceImg.setImageResource(generateRandom())
        diceImg2.setImageResource(generateRandom())
    }
}