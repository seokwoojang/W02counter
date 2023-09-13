package com.example.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            //main.btnAdd.text="눌렀습니다."
            //main.txtCount.text ="hihi"
            //main.txtCount.text = ""+ ++count
            main.txtCount.text = "${++count}"
        }
        main.btnSub.setOnClickListener {
            if (count > 0)
                main.txtCount.text ="${--count}"
        }
        main.Clear.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"
        }
    }
}