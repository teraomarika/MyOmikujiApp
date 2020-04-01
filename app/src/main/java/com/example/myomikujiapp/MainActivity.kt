package com.example.myomikujiapp


import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getomikujibutton.setOnClickListener { it: View? ->
//            Log.v("MainActivity","Button Clicked")
            val results= arrayOf("大吉","凶","吉","中吉","小吉")

//            val n = Random
//            .nextInt(5)
            val n = Random
                .nextInt(results.count())
            if(n == 0){
                resultTextView.setTextColor(Color.RED)
            }else{
                resultTextView.setTextColor(Color.parseColor("#808080"

                ))
            }
            resultTextView.text = results.get(n)


            }
        }
    }


