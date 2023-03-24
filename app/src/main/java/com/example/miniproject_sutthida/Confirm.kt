package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_confirm.*

class Confirm : AppCompatActivity() {

    private lateinit var showOrder: TextView
    private lateinit var showName: TextView
    private lateinit var showEmail: TextView
    private lateinit var showPhone: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        showOrder = findViewById(R.id.showOrder)
        showName = findViewById(R.id.showName)
        showEmail = findViewById(R.id.showEmail)
        showPhone = findViewById(R.id.showPhone)

        var intent = intent

        showOrder.text = intent.getStringExtra("order")
        showName.text = intent.getStringExtra("FullName")
        showEmail.text = intent.getStringExtra("Email")
        showPhone.text = intent.getStringExtra("Phone")

        Cmenu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
        Cback.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
        Chome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}