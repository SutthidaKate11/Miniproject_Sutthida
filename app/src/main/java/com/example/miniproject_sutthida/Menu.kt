package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_menu_france.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        imageButton2!!.setOnClickListener {
            val intent = Intent(this, MenuFrance::class.java)
            startActivity(intent)
        }
        imageButton7!!.setOnClickListener {
            val intent = Intent(this, MenuNewzealand::class.java)
            startActivity(intent)
        }
        imageButton8!!.setOnClickListener {
            val intent = Intent(this, MenuItaly::class.java)
            startActivity(intent)
        }
        imageButton9!!.setOnClickListener {
            val intent = Intent(this, MenuUSA2::class.java)
            startActivity(intent)
        }
        imageButton10!!.setOnClickListener {
            val intent = Intent(this, MenuSpain::class.java)
            startActivity(intent)
        }
    }
}