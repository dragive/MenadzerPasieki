package Klasy.KlasyPomocnicze

import Klasy.Exceptions.DataExceptions.*
import Klasy.Exceptions.nieprawidloweDaneException
import Klasy.Exceptions.nieprawidlowyIntException
import Klasy.Exceptions.zaduzaWartoscIntException
import Klasy.Exceptions.zamalaWartoscIntException
import kotlin.test.todo

class Data {

    private var Rok : Int? = null
    var rok : Int?
        get() = this.Rok
        set(value){
            if (value!! < 2000 ){
                throw zamalaWartoscIntException()
            }
            this.Rok = value
        }


    private var Miesiac : Int? = null
    var miesiac : Int?
        get() = this.Miesiac
        set(value){
            value!!
            if (value < 1){
                throw zamalaWartoscIntException()
            }
            if(value > 12 )
                throw  zaduzaWartoscIntException()
            this.Miesiac = value
        }


    private var Dzien : Int? = null
    var dzien : Int?
        get() = this.Dzien
        set(value){
            value!!
            if (value < 1 ){
                throw zamalaWartoscIntException()
            }
            if(value > 31 ) {
                throw zaduzaWartoscIntException()
            }
            this.Dzien = value
        }



    constructor(rok: Int, miesiac: Int, dzien: Int){
        this.rok = rok
        this.miesiac = miesiac
        this.dzien = dzien
    }
    constructor(){
        this.Rok = null
        this.Miesiac = null
        this.Dzien = null
    }
    constructor(data : String){
        var tab = parserFromString(data)
        this.rok = tab[0]
        this.miesiac = tab[1]
        this.dzien = tab[2]
        this.sprawdzPoprawoscFormatuDaty()
    }


    fun ileDniWMiesiacu(rok: Int, miesiac: Int): Int{
        var ret : Int = 0
        when(miesiac){
            1,3,5,7,8,10,12 -> ret = 31
            2 -> {
                if (rok % 400 == 0 )
                    ret = 29
                else if (rok % 100 == 0)
                    ret = 28
                else if (rok % 4 == 0 ){
                    ret = 29
                }
                else ret = 28
            }
            4,6,9,11 -> ret = 30
            else -> throw nieprawidlowyIntException()
        }
        return ret
    }

    fun sprawdzPoprawoscFormatuDaty() {
        if(this.Rok!! < 1)throw zaMalyRokException()
        if(this.Rok!! > 12) throw zaDuzyRokException()

        if(this.Miesiac!! < 1)throw zaMalyMiesiacException()
        if(this.Miesiac!! > 12) throw zaDuzyMiesiacException()

        if(this.Dzien!! < 1) throw zaMalyDzienException()
        if(this.Dzien!! > ileDniWMiesiacu(this.Rok!!,this.Miesiac!!)) throw zaDuzyDzienException()

    }
    //todo Private
     fun parserFromString(data : String): Array<Int>{
        if(data.length != 10) throw nieprawidloweDaneException()
        var m = ""
        var d = ""
        var r = ""

        for ( i in 0..3) r=r+data[i]
        for ( i in 5..6) m=m+data[i]
        for ( i in 8..9) d=d+data[i]

        var rok = r.toInt()
        var miesiac = m.toInt()
        var dzien = d.toInt()

        return arrayOf(rok,miesiac,dzien)
    }

    override fun toString(): String {
        fun totwo(x : String): String {
            var y: String =x
            if (y.length == 1) y = "0"+y
            return y
        }

        var ret = ""
        ret = this.Rok.toString() + "-" + totwo(this.Miesiac.toString()) + "-" + totwo(this.Dzien.toString())
        return ret
    }

}