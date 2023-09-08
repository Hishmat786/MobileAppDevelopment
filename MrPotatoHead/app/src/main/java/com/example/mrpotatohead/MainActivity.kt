package com.example.mrpotatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c = findViewById<CheckBox>(R.id.heat)
        val eb = findViewById<CheckBox>(R.id.eyeBrow)
        val n = findViewById<CheckBox>(R.id.nose)
        val mo = findViewById<CheckBox>(R.id.mos)
        val a = findViewById<CheckBox>(R.id.arms)
        val ey = findViewById<CheckBox>(R.id.eye)
        val g = findViewById<CheckBox>(R.id.glasses)
        val m = findViewById<CheckBox>(R.id.mouth)
        val ea = findViewById<CheckBox>(R.id.ear)
        val s = findViewById<CheckBox>(R.id.shoes)

        val top = findViewById<ImageView>(R.id.topi)
        val nan = findViewById<ImageView>(R.id.nen)
        val nk = findViewById<ImageView>(R.id.nak)
        val mu = findViewById<ImageView>(R.id.muchhon)
        val ba = findViewById<ImageView>(R.id.banh)
        val an = findViewById<ImageView>(R.id.ankh)
        val ch = findViewById<ImageView>(R.id.chashimo)
        val mon = findViewById<ImageView>(R.id.dand)
        val kn = findViewById<ImageView>(R.id.kan)
        val bot = findViewById<ImageView>(R.id.boot)


        c.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                top.visibility = ImageView.VISIBLE
            } else {
                top.visibility = ImageView.INVISIBLE
            }
        }

        eb.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                nan.visibility = ImageView.VISIBLE
            } else {
                nan.visibility = ImageView.INVISIBLE
            }
        }

        mo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mu.visibility = ImageView.VISIBLE
            } else {
                mu.visibility = ImageView.INVISIBLE
            }
        }

        n.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                nk.visibility = ImageView.VISIBLE
            } else {
                nk.visibility = ImageView.INVISIBLE
            }
        }

        a.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                ba.visibility = ImageView.VISIBLE
            } else {
                ba.visibility = ImageView.INVISIBLE
            }
        }

        ey.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                an.visibility = ImageView.VISIBLE
            } else {
                an.visibility = ImageView.INVISIBLE
            }
        }

        g.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                ch.visibility = ImageView.VISIBLE
            } else {
                ch.visibility = ImageView.INVISIBLE
            }
        }

        m.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mon.visibility = ImageView.VISIBLE
            } else {
                mon.visibility = ImageView.INVISIBLE
            }
        }

        ea.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                kn.visibility = ImageView.VISIBLE
            } else {
                kn.visibility = ImageView.INVISIBLE
            }
        }

        s.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                bot.visibility = ImageView.VISIBLE
            } else {
                bot.visibility = ImageView.INVISIBLE
            }
        }

    }
}