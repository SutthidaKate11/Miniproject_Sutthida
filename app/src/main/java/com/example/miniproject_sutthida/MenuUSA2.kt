package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_menu_france.*
import kotlinx.android.synthetic.main.activity_menu_france.Card25
import kotlinx.android.synthetic.main.activity_menu_france.Card31
import kotlinx.android.synthetic.main.activity_menu_france.Card32
import kotlinx.android.synthetic.main.activity_menu_france.Card33
import kotlinx.android.synthetic.main.activity_menu_france.Card34
import kotlinx.android.synthetic.main.activity_menu_italy.*
import kotlinx.android.synthetic.main.activity_menu_usa2.*

class MenuUSA2 : AppCompatActivity() {
    var cardview31 : CardView? = null
    var cardView32 : CardView? = null
    var cardView33 : CardView? = null
    var cardView34 : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_usa2)
        cardview31 = findViewById<CardView>(R.id.Card31)
        cardView32 = findViewById<CardView>(R.id.Card32)
        cardView33 = findViewById<CardView>(R.id.Card33)
        cardView34 = findViewById<CardView>(R.id.Card34)

        Card31!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","STAGLIN FAMILY VINEYARD                           Price : ฿8,990")
            startActivity(intent)
        }
        Card32!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","ABREU                                          Price : ฿26,350")
            startActivity(intent)
        }
        Card33!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","STAGLIN FAMILY VINEYARD                                  Price : ฿9,480")
            startActivity(intent)
        }
        Card34!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","CAPTURE                               Price : ฿6,920")
            startActivity(intent)
        }

        mus3.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}