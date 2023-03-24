package com.example.miniproject_sutthida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_confirm.*
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    private lateinit var txtOrder: TextView
    private lateinit var editName: EditText
    private lateinit var edittEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var bConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txtOrder = findViewById<TextView>(R.id.txtOrder)

        var intent = intent

        txtOrder.text = intent.getStringExtra("order")

        editName = findViewById<EditText>(R.id.editName)
        edittEmail = findViewById<EditText>(R.id.edittEmail)
        editPhone = findViewById<EditText>(R.id.editPhone)

        bConfirm = findViewById<Button>(R.id.bConfirm)

        bConfirm.setOnClickListener {
            val dataIntent = Intent(this,Confirm::class.java)
            dataIntent.putExtra("order",intent.getStringExtra("order"))
            dataIntent.putExtra("FullName",editName.text.toString())
            dataIntent.putExtra("Email",edittEmail.text.toString())
            dataIntent.putExtra("Phone",editPhone.text.toString())
            startActivity(dataIntent)
        }
        bCancle.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}