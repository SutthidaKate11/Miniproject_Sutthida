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
import kotlinx.android.synthetic.main.activity_menu_italy.*

class MenuItaly : AppCompatActivity() {

    var cardview21 : CardView? = null
    var cardView22 : CardView? = null
    var cardView23 : CardView? = null
    var cardView24 : CardView? = null
    var cardView25 : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_italy)

        cardview21 = findViewById<CardView>(R.id.Card31)
        cardView22 = findViewById<CardView>(R.id.Card32)
        cardView23 = findViewById<CardView>(R.id.Card33)
        cardView24 = findViewById<CardView>(R.id.Card34)
        cardView25 = findViewById<CardView>(R.id.Card25)


        Card31!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","MORGANTE                       Price : ฿2,300")
            startActivity(intent)
        }
        Card32!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","ILAURI BY AZIENDA VINICOLA TALAMONTI   Price : ฿820")
            startActivity(intent)
        }
        Card33!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","LA GUARDIENSE                               Price : ฿805")
            startActivity(intent)
        }
        Card34!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","I GIUSTI / ZANZA                Price : ฿1,075")
            startActivity(intent)
        }
        Card25!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","KRESSMANN                        Price : ฿1,060")
            startActivity(intent)
        }
        mui.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}