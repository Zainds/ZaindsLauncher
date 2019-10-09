package com.example.nicepreeeject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.content.Intent


class MainActivity : AppCompatActivity() {
    var trueLogin : String = "chmo"
    var truePass : String = "milosy privet"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun DANCE(v: View){
        var LOGIN : EditText = findViewById(R. id. log)
        var PAROL : EditText = findViewById(R. id. pass)
        var res : TextView = findViewById(R. id. result)
        if (trueLogin == LOGIN.text.toString() && truePass == PAROL.text.toString()) {
            var next = Intent(this, Main2Activity::class.java)
            startActivity(next)
        }
        else {
            var back = Intent(this, Main3Activity::class.java)
            startActivity(back)
        }

    }

}
