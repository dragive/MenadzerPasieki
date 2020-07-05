package Klasy.Komponenty

abstract class Przedmiot {
    var nazwa : String = ""
    constructor(nazwa: String){
        if (nazwa.length == 0){

        }
        this.nazwa = nazwa
    }
}