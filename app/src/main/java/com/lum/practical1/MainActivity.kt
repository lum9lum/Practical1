package com.lum.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking to code
        val buttonHide: Button = findViewById(R.id.buttonHide)
        val buttonShow: Button = findViewById(R.id.buttonShow)

        val textViewName: TextView = findViewById(R.id.textMyName)
        val textViewHW: TextView = findViewById(R.id.textHW)

        val imageQR: ImageView = findViewById(R.id.imageQR)

        textViewName.visibility = View.INVISIBLE
        imageQR.visibility = View.INVISIBLE
        textViewHW.visibility = View.VISIBLE

        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageQR.visibility = View.INVISIBLE
            textViewHW.visibility = View.VISIBLE
        }

        buttonShow.setOnClickListener {
            imageQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
            textViewHW.visibility = View.INVISIBLE
        }
    }
}