package pl.pasiekarodosna.menadzerpasieki.Functions

import android.content.Context
import android.widget.Toast

fun toast(context: Context,long: Boolean,tresc: String){
    Toast.makeText(context,tresc,Toast.LENGTH_LONG).show()
}