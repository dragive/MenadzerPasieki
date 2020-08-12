package pl.pasiekarodosna.menadzerpasieki.Klasy

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import pl.pasiekarodosna.menadzerpasieki.Activities.DebugRecyclerViewActivity
import pl.pasiekarodosna.menadzerpasieki.Activities.KonsolaActivity
import pl.pasiekarodosna.menadzerpasieki.Activities.ListaMatekActivity

import java.io.PrintWriter
import java.io.StringWriter
import pl.pasiekarodosna.menadzerpasieki.Functions.*
import pl.pasiekarodosna.menadzerpasieki.Klasy.Exceptions.wyjscieThrowable

class Konsola{
    var out = ""
    var context : Context? = null
    constructor(context: Context){
        this.context = context
    }
    fun wykonajPolecenie(polecenie: String,context: Context): String {
        try{
            when(polecenie){
                "c","clear","cls" -> return ""
                "h","help","p","pomoc" -> pomoc()
                "t","toast" -> toast(context,true, "123")
                "q","quit","wyjdz","exit" -> throw wyjscieThrowable()
                "Alm" -> {
                    var i = Intent(context,ListaMatekActivity::class.java)
                    i.addFlags(FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(i)
                }
                "D el" -> {
                    var i = Intent(context,DebugRecyclerViewActivity::class.java)
                    i.addFlags(FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(i)
                }

                else -> {this.out=this.out + "\n"+ "Nie znaleziono polecenia! ["+polecenie+"]"}
            }
        }
        catch (ex : Throwable){
            this.out = this.out +"\n" + getStackTrace(ex)
        }
        return out
    }

    private fun pomoc() {
        this.out += "\n===========\n"
        this.out += "c -> wyczysc bufor terminala\n"
        this.out += "h -> wyswietl pomoc\n"
        this.out += "q -> wyjdz z programu\n"
        this.out += "t -> test toastu\n"
        this.out += "===========\n"
    }

    fun getStackTrace(t: Throwable): String? {
        val sw = StringWriter()
        t.printStackTrace(PrintWriter(sw))
        return sw.toString()
    }
}