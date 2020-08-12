package Klasy.Komponenty

import Klasy.Exceptions.zakrotkiStringException

open class Przedmiot {
    var opis: String =""
    var nazwa : String = ""
    constructor(nazwa: String,opis:String=""){
        if (nazwa.length == 0){
            throw zakrotkiStringException()
        }
        this.nazwa = nazwa
        this.opis = opis
    }



}