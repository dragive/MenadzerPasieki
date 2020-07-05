package Klasy.Matecznosc

import Klasy.Exceptions.nieprawidloweDaneException
import Klasy.Exceptions.ujemnaWartoscIntException
import Klasy.Exceptions.zakrotkiStringException
import Klasy.Exceptions.zamalaWartoscIntException

class Matka : StanRozrodu  {
    private var rasa : String = ""
    var rasaMatki :String
        get() = this.rasa
        set(value:String){
            if(value.length == 0 )
                throw zakrotkiStringException()
            this.rasa = value
        }

    var rok: Int = 2000
    var linia: String = ""
    var czyOznaczona: Boolean = false
    var przeznaczenie: String = ""
    var zaplodniona: Boolean = false

    constructor(): super() {
    }




}