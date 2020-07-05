package pl.pasiekarodosna.menadzerpasieki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var text: TextView = findViewById(R.id.textview)
        var button: Button = findViewById(R.id.buttontest)
        button.text = "############"
        button.setOnClickListener{

            var tekst: String = text.text.toString()
            var liczba: Int = tekst.toInt()
            text.text = (liczba+1).toString()

        }
        button.setOnLongClickListener {
            text.text = "0"
            true
        }



        }
    }






