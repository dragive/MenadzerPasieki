package pl.pasiekarodosna.menadzerpasieki.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.ekran_glowny.*
import pl.pasiekarodosna.menadzerpasieki.R

class EkranGlowny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ekran_glowny)
        }

    override fun onStart() {
        super.onStart()
        var x =doKonsoli.setOnClickListener{
            startActivity(Intent(this,
                KonsolaActivity::class.java))
            finish()
        }
    }

    }







