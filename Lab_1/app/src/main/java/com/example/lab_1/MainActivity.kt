package com.example.lab_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab1_task2)

//        var count=1
//        var num: TextView= findViewById<TextView>(R.id.counter)
//        var ltoast : Button = findViewById<Button>(R.id.toast)
//        var click : Button = findViewById<Button>(R.id.counterButton)
//
//        click.setOnClickListener {
//            num.setText(""+count++)
//        }
//
//        ltoast.setOnClickListener {
//            Toast.makeText(this,"This is Toast",Toast.LENGTH_LONG).show()
//        }


        var mesage: TextView = findViewById(R.id.message)
        var btn: Button= findViewById(R.id.button2)

        btn.setOnClickListener {
            var numb: EditText= findViewById(R.id.num)
            var myNewInt: Int = numb.text.toString().toInt()

            val rnds = (0..10).random()

            if(myNewInt>rnds){
                mesage.setText("Too High")
            }else if(myNewInt<rnds){
                mesage.setText("Too Low")
            }else{
                mesage.setText("Congrats")
            }

        }

    }
}