package Klasy.Komponenty

import Klasy.Exceptions.zakrotkiStringException

open class Przedmiot {
    var nazwa : String = ""
    constructor(nazwa: String){
        if (nazwa.length == 0){
            throw zakrotkiStringException()
        }
        this.nazwa = nazwa
    }

}