package pl.pasiekarodosna.menadzerpasieki.Activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.konsola.*
import pl.pasiekarodosna.menadzerpasieki.Klasy.Exceptions.wyjscieThrowable
import pl.pasiekarodosna.menadzerpasieki.Klasy.Konsola
import pl.pasiekarodosna.menadzerpasieki.R


class KonsolaActivity : AppCompatActivity() {

    var konsola = Konsola(this)
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.konsola)
        var x = button2.setOnClickListener{

            try{
                textView2.text = konsola.wykonajPolecenie(data.text.toString(),applicationContext)
                data.setText("")
            }
            catch(th: wyjscieThrowable){finish()}
        }

        /*var editText = R.id.data as EditText
        editText.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            val input: String
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                textView2.text = textView2.text.toString() + "\n1111"
                return@OnEditorActionListener true
            }
            false})*/

        }




    }







