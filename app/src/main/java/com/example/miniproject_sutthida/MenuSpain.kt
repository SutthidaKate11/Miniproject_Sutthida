package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_menu_france.*
import kotlinx.android.synthetic.main.activity_menu_france.Card31
import kotlinx.android.synthetic.main.activity_menu_france.Card32
import kotlinx.android.synthetic.main.activity_menu_france.Card33
import kotlinx.android.synthetic.main.activity_menu_france.Card34
import kotlinx.android.synthetic.main.activity_menu_france.Card25
import kotlinx.android.synthetic.main.activity_menu_newzealand.*
import kotlinx.android.synthetic.main.activity_menu_spain.*

class MenuSpain : AppCompatActivity() {

    var cardview21 : CardView? = null
    var cardView22 : CardView? = null
    var cardView23 : CardView? = null
    var cardView24 : CardView? = null
    var cardView25 : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_spain)

        cardview21 = findViewById<CardView>(R.id.Card31)
        cardView22 = findViewById<CardView>(R.id.Card32)
        cardView23 = findViewById<CardView>(R.id.Card33)
        cardView24 = findViewById<CardView>(R.id.Card34)
        cardView25 = findViewById<CardView>(R.id.Card25)


        Card31!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","MUGA                                   Price : ฿1,685")
            startActivity(intent)
        }
        Card32!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","MUGA                                  Price : ฿3,855")
            startActivity(intent)
        }
        Card33!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","SANDARA                      Price : ฿300")
            startActivity(intent)
        }
        Card34!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","ARZUAGA                       Price : ฿1,275")
            startActivity(intent)
        }
        Card25!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","PARES BALTA                     Price : ฿1,045")
            startActivity(intent)
        }
        mus.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}