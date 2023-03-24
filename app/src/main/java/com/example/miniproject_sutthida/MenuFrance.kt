package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Sent
import android.widget.Button
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_menu_france.*

class MenuFrance : AppCompatActivity() {

    var cardview1 : CardView? = null
    var cardView2 : CardView? = null
    var cardView3 : CardView? = null
    var cardView4 : CardView? = null
    var cardView5 : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_france)

        cardview1 = findViewById<CardView>(R.id.Card31)
        cardView2 = findViewById<CardView>(R.id.Card31)
        cardView3 = findViewById<CardView>(R.id.Card31)
        cardView4 = findViewById<CardView>(R.id.Card31)
        cardView5 = findViewById<CardView>(R.id.Card31)


        Card31!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","CHÂTEAU PALMER        Price : ฿7,100")
            startActivity(intent)
        }
        Card32!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","CHÂTEAU BEYCHEVELLE Price : ฿3,150")
            startActivity(intent)
        }
        Card33!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","DOMAINE JACQUES       Price : ฿5,010")
            startActivity(intent)
        }
        Card34!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","CHATEAU FERRAN        Price : ฿2,040")
            startActivity(intent)
        }
        Card25!!.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("order","KRESSMANN                       Price : ฿1,060")
            startActivity(intent)
        }
        muf.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}