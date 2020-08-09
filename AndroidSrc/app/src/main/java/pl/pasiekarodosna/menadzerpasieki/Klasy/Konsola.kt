package pl.pasiekarodosna.menadzerpasieki.Klasy

import java.io.PrintWriter
import java.io.StringWriter

class Konsola{
    var out = ""

    fun wykonajPolecenie(polecenie: String): String {
        try{
            when(polecenie){
                "c","clear","cls" -> return ""
                "h","help","p","pomoc" -> pomoc()

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
        this.out += "\n===========\n"
    }

    fun getStackTrace(t: Throwable): String? {
        val sw = StringWriter()
        t.printStackTrace(PrintWriter(sw))
        return sw.toString()
    }
}