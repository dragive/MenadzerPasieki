package Klasy.Matecznosc

import Klasy.Exceptions.nieprawidloweDaneException
import Klasy.Exceptions.zakrotkiStringException


class Matka : StanRozrodu  {
    private var Rasa : String = ""
    var rasa: String
        get() = this.Rasa
        set(value){
            if (value.length == 0 ) throw zakrotkiStringException()
            this.Rasa = value
        }
    var rokWygryzienia: Int = 2000

    var dataPodania: String = ""
    var linia: String = ""
    var czyOznaczona: Boolean = false
    var przeznaczenie: String = ""
    var zaplodniona: Boolean = false
    var plodnosc: String  = ""

    constructor(): super()
    constructor(opis : String ):super(opis)




}