package com.example.houseview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display1_bhk.*

class display1BHK : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display1_bhk)

    val name = intent.getStringExtra(NAME_EXTRA)
        welcomeMessage.text="Welcome dear $name!"

        }
    }


