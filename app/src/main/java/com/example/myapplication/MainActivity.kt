package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity

import android.widget.Toast.makeText as makeText1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import android.widget.Toast
//import com.example.myapplication.res.layout.ActivityMainBinding

//import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//     create.setOnClickListener()


    }

    fun createBirthday(view: View) {
//
        val name: String =  nameInput.editableText.toString()
          Toast.makeText(this, "Hello $name", Toast.LENGTH_LONG).show()

        val intent = Intent( this, birthdayact::class.java  )
        intent.putExtra( "name",name)
        startActivity(intent)




}


}