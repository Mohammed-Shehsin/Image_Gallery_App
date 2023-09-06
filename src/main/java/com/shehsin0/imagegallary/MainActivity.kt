package com.shehsin0.imagegallary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val txt = findViewById<TextView>(R.id.textView)
        val ids: Array<Int> = arrayOf(
            R.drawable.i1 ,
            R.drawable.i2 ,
            R.drawable.i3
        )
        var counter =0
        val length = ids.size
        var currentImageId = counter + 1
        txt.text = "     "+ currentImageId.toString()+" / 3 "
        imageView.setImageResource(ids[0])
        btnNext.setOnClickListener{
            counter++
            if(counter>= length){
                counter =0
            }
            currentImageId = counter + 1
            txt.text ="     "+currentImageId.toString()+" / 3"
            imageView.setImageResource(ids[counter])

        }
        btnBack.setOnClickListener{
            counter--
            if(counter<0){
                counter = length-1
            }
            currentImageId = counter + 1
            txt.text ="     "+currentImageId.toString()+" / 3"
            imageView.setImageResource(ids[counter])
        }
    }
}