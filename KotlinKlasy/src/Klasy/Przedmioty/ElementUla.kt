package Klasy.Komponenty

import java.util.*

class ElementUla : Przedmiot{
    var system : String = ""
    var zawieraneElementyUla = Vector < Pair<ElementUla,Int>>()
    constructor(nazwa:String, system : String,opis : String = ""):super(nazwa,opis){
        this.system = system
    }

    override fun toString(): String {
        return "nazwa: "+super.nazwa+" system: "+this.system
    }


}