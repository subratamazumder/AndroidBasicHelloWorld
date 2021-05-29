package com.subrata.poc.android.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tryMeButton: Button = findViewById(R.id.button)
        val imageVew: ImageView = findViewById(R.id.imageView)
        val selfiImageRange = 1..4
        tryMeButton.setOnClickListener{
            val toast = Toast.makeText(this, "Trying your luck!!", Toast.LENGTH_SHORT)
            toast.show()
            val randomNumber = selfiImageRange.random()
            if (randomNumber == 1)
                imageVew.setImageResource(R.drawable.bdayselfi1)
            else if (randomNumber == 2)
                imageVew.setImageResource(R.drawable.bdayselfi2)
            else if (randomNumber == 3)
                imageVew.setImageResource(R.drawable.bdayselfi3)
            else
                imageVew.setImageResource(R.drawable.bdayselfi4)
        }
    }
}