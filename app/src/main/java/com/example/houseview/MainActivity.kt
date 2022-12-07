package com.example.houseview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import com.example.houseview.display1BHK as displayBHK1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show_1bhk(view: View){

        val intent = Intent(this, displayBHK1::class.java)
        val name=inputName.editableText.toString()
        intent.putExtra(displayBHK1.NAME_EXTRA,name)
        startActivity(intent)


    }

    fun show_2bhk(view: View) {
        val intent = Intent(this, display2BHK::class.java)
        startActivity(intent)


    }

    fun show_3bhk(view: View){
        val intent = Intent(this, display3BHK::class.java)
        startActivity(intent)


    }
    fun show_4bhk(view: View){
        val intent = Intent(this, display4BHK::class.java)
        startActivity(intent)


    }
}