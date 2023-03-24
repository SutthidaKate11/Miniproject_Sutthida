package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_menu_france.Card31
import kotlinx.android.synthetic.main.activity_menu_france.Card32
import kotlinx.android.synthetic.main.activity_menu_france.Card33
import kotlinx.android.synthetic.main.activity_menu_france.Card34
import kotlinx.android.synthetic.main.activity_menu_france.Card25
import kotlinx.android.synthetic.main.activity_menu_newzealand.*

class MenuNewzealand : AppCompatActivity() {

    var cardview16 : CardView? = null
    var cardView17 : CardView? = null
    var cardView18 : CardView? = null
    var cardView19 : CardView? = null
    var cardView20 : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_newzealand)

        cardview16 = findViewById<CardView>(R.id.Card31)
        cardView17 = findViewById<CardView>(R.id.Card32)
        cardView18 = findViewById<CardView>(R.id.Card33)
        cardView19 = findViewById<CardView>(R.id.Card34)
        cardView20 = findViewById<CardView>(R.id.Card25)


        Card31!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","ATA RANGI                      Price : ฿1,240")
            startActivity(intent)
        }
        Card32!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","TOHU                                          Price : ฿1,300")
            startActivity(intent)
        }
        Card33!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","OYSTER BAY                         Price : ฿1,205")
            startActivity(intent)
        }
        Card34!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","GREYWACKE                               Price : ฿1,605")
            startActivity(intent)
        }
        Card25!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","MIURA VINEYARDS                        Price : ฿3,080")
            startActivity(intent)
        }
        mun.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}