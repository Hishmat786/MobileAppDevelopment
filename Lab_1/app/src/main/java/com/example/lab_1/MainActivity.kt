package com.example.lab_1

import android.graphics.Color.blue
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radio_group)

        val change: Button = findViewById(R.id.button)

        change.setOnClickListener {
            var id: Int = radioGroup.checkedRadioButtonId

            // Is any radio button checked from radio group?
            if (id != -1){
                // Get the instance of radio button using id
                val radio: RadioButton = findViewById(id)
                val l1 = findViewById<View>(R.id.background) as LinearLayout

                if(radio.text=="Dark"){
                    l1.setBackgroundColor( android.graphics.Color.parseColor("#FF0E0E0E"));

                }else if(radio.text=="Light"){
                    l1.setBackgroundColor( android.graphics.Color.parseColor("#FFFFFEFE"));
                }else if(radio.text=="Green"){
                    l1.setBackgroundColor( android.graphics.Color.parseColor("#FF4CAF50"));
                }else if(radio.text=="Red"){
                    l1.setBackgroundColor( android.graphics.Color.parseColor("#FFF44336"));
                }

                //You can also use "applicationContext" in place of "this" as
                //the first parameter to makeText method
                Toast.makeText(applicationContext,"On button click :" + " ${radio.text}", Toast.LENGTH_SHORT).show()
            }
            else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" + " nothing selected",Toast.LENGTH_SHORT).show()
            }
        }
    }
}