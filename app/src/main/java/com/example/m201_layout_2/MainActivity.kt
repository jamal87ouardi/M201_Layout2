package com.example.m201_layout_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

     val ed_nom = findViewById<EditText>(R.id.nom)

     val rb_gazoil = findViewById<RadioButton>(R.id.gazoil)

     val rb_essence = findViewById<RadioButton>(R.id.essence)

     val btn_calcu = findViewById<Button>(R.id.calculer)

     val sw_boiteAuto = findViewById<Switch>(R.id.boite_auto)

     val txt_prix = findViewById<TextView>(R.id.prix)

    btn_calcu.setOnClickListener {

        var price = 0

        if(rb_gazoil.isChecked) {
            if (sw_boiteAuto.isChecked) {

                price = 166000

            } else {
                price = 150000


            }
        }
        else {
                if(sw_boiteAuto.isChecked) {

                    price = 154000

                }

                else {
                    price = 143000


                }


        }
        txt_prix.text = price.toString()

        }



    }

}
