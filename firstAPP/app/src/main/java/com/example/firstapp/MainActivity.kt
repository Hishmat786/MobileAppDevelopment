package com.example.firstapp
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab1_task1)
        /******Task1ss
        val message= findViewById<TextView>(R.id.msg)
        val change = findViewById<Button>(R.id.btn)

        change.setOnClickListener {
            message.setText("Someone tap the button")
            change.setText("I am Clicked")
        }*/


        /**val rn= (0..10).random()
        println("Random is: ")
        println(rn)

        var ms= findViewById<TextView>(R.id.reply)
        var gess= findViewById<EditText>(R.id.gusseNumber)
        var click= findViewById<Button>(R.id.button2)

        val number: Int = gess.text.toString().toInt()

        click.setOnClickListener {
//            if(number > rn){
//                ms.setText("You are too High")
//            }else if(number < rn){
//                ms.setText("You are too Low")
//            }else{
//                ms.setText("Congrats You Crack it...")
//            }
        }
        */

        /**
        var count=1
        var num= findViewById<TextView>(R.id.counter)
        var toas= findViewById<Button>(R.id.toast)
        var click= findViewById<Button>(R.id.Counter)

        click.setOnClickListener {
            num.setText(""+count++)
        }
        toas.setOnClickListener { // Displaying simple Toast message
            Toast.makeText(applicationContext, "This a toast message", Toast.LENGTH_LONG).show()
        }
        */


    }
}
